package simplejersey;

import epic.templating.RenderingEngine;
import epic.templating.jaxrs.ElementBodyWriter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import simplejersey.resources.HelloWorldResource;
import simplejersey.resources.epic.EpicResource;
import simplejersey.resources.plain.PlainResource;

import javax.inject.Provider;

public class App 
{
    public static void main( String[] args ) throws Exception{

        // First we setup epic-templating
        final RenderingEngine re = new RenderingEngine();

        // Since we are not using a dependency manager like guice we make our own Provider.
        Provider<RenderingEngine> pre = new Provider<RenderingEngine>() {
            public RenderingEngine get() {
                return re;
            }
        };

        // The MessageBodyWriter that allows writing Elements from jersey
        ElementBodyWriter ebw = new ElementBodyWriter( pre );

        // Our resource configuration for jersey
        ResourceConfig rc = new ResourceConfig(  );
        rc.register( HelloWorldResource.class );
        rc.register( PlainResource.class );
        rc.register( EpicResource.class );
        // ADD HERE!
        // rc.register( PeopleResource.class );
        // rc.register( PeoplePurchasesResource.class );
        // ...

        // register the ElementBodyWriter in order to write Elements
        rc.register( ebw );

        // This container (which is a servlet) will route requests to our resources
        ServletContainer sc = new ServletContainer( rc );

        // To register a servlet instance we need to wrap it in a holder.
        ServletHolder h = new ServletHolder( sc );

        // Jetty server needs some sort of handler to process requests.
        ServletContextHandler sch = new ServletContextHandler();
        // We will take the root path for this application
        sch.setContextPath( "/" );
        // All request that enter this context should go to jersey
        sch.addServlet( h, "/*" );

        // The simplest possibly jetty server
        Server server = new Server(8080);
        // and we add our handler that forwards to jersey
        server.setHandler( sch );
        // run the simplest jetty server
        server.start();
        server.join();
    }
}
