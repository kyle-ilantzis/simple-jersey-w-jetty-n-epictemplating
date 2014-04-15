package simplejersey.resources;

import epic.templating.BeanTemplate;
import epic.templating.Element;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A HelloWorldResource is a BeanTemplate which is an Element.
 * A BeanTemplate knows how to render itself. see HelloWorldResource.ftl
 */
@Path("")
public class HelloWorldResource implements BeanTemplate {

    @GET
    @Produces( MediaType.TEXT_HTML )
    public Element hello() {
        return this;
    }
}