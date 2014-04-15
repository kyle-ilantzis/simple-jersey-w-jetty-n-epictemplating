package simplejersey.resources.plain;

import epic.templating.Element;
import epic.templating.MapTemplate;
import simplejersey.data.Books;
import simplejersey.pojos.PlainBook;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * This resource demonstrates MapTemplates
 */
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

    @GET
    @Path( "book/{id}" )
    @Produces( MediaType.TEXT_HTML )
    public Element plainBook(@PathParam( "id" ) int id ) {

        PlainBook b = Books.getPlainBookById( id );

        if (b == null) {
            throw new NotFoundException(  );
        }

        MapTemplate m = MapTemplate.fromResource( this.getClass(), "book.html.ftl" );
        m.put( "book", b );
        return m;
    }
}
