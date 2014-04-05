package simplejersey.resources.plain;

import epic.templating.Element;
import epic.templating.MapTemplate;
import simplejersey.data.Books;
import simplejersey.pojos.PlainBook;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path( "plainHello" )
public class PlainResource {

    @GET
    @Produces( MediaType.TEXT_HTML )
    public Element plainBooks() {

        List<PlainBook> bs = Books.getPlainBooks();

        MapTemplate m = MapTemplate.fromResource( this.getClass(), "books.html.ftl" );
        m.put( "books", bs );
        return m;
    }
}
