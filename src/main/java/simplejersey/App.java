package simplejersey;

import epic.templating.RenderingEngine;
import epic.templating.jaxrs.ElementBodyWriter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
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
        // We need this just a little bit below.
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

        // To register a servlet instance with a ServletHandler we need to wrap the instance
        // in a holder.
        ServletHolder h = new ServletHolder( sc );

        // Jetty server needs a handler to process requests.
        // We use a handler that forwards to servlets
        ServletHandler sh = new ServletHandler();
        // and register an jersey resource config (which is wrapped in a ServletContainer which is wrapped in
        // a ServletHolder)
        sh.addServletWithMapping( h, "/" );

        // The simplest possibly jetty server
        Server server = new Server(8080);
        // and we add our handler that forwards to jersey
        server.setHandler( sh );
        // run the simplest jetty server
        server.start();
        server.join();
    }
}
