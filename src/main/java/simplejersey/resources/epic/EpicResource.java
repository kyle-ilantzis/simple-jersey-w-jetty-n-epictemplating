package simplejersey.resources.epic;

import epic.templating.Element;
import simplejersey.data.Books;
import simplejersey.epicpage.Page;
import simplejersey.epicpojos.EpicBook;
import simplejersey.epicpojos.EpicBooks;
import simplejersey.web.css.EpicStyle;
import simplejersey.web.js.TimeJs;

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

        EpicBooks ebs = new EpicBooks();
        ebs.setBooks( bs );

        Page p = Page.ok( "Epic Books", ebs );
        p.setStyle( EpicStyle.INSTANCE );
        p.setScript( TimeJs.INSTANCE );
        return p;
    }
}
