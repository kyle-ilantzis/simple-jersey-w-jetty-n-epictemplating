package simplejersey.resources;

import epic.templating.BeanTemplate;
import epic.templating.Element;
import simplejersey.resources.epic.EpicResource;
import simplejersey.resources.plain.PlainResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class HelloWorldResource implements BeanTemplate {

    @GET
    @Produces( MediaType.TEXT_HTML )
    public Element hello() {
        return this;
    }
}