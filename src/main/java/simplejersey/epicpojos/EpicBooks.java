package simplejersey.epicpojos;

import epic.templating.BeanTemplate;

import java.util.List;

/**
 * An EpicBooks is a BeanTemplate which is an Element.
 * A BeanTemplate knows how to render itself. see EpicBooks.ftl
 */
public class EpicBooks implements BeanTemplate {

    private List<EpicBook> books;

    public EpicBooks() {
    }

    public List<EpicBook> getBooks() {
        return books;
    }

    public void setBooks( List<EpicBook> books ) {
        this.books = books;
    }
}
