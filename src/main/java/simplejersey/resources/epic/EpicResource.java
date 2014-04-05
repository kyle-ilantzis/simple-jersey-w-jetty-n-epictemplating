package simplejersey.resources.epic;

import epic.templating.Element;
import epic.templating.MapTemplate;
import simplejersey.data.Books;
import simplejersey.epicpojos.EpicBook;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path( "epicHello" )
public class EpicResource {

    @GET
    @Produces( MediaType.TEXT_HTML )
    public Element epicBooks() {

        List<EpicBook> bs = Books.getEpicBooks();

        MapTemplate m = MapTemplate.fromResource( this.getClass(), "books.html.ftl" );
        m.put( "books", bs );
        return m;
    }
}
