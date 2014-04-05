package simplejersey.epicpojos;

import epic.templating.BeanTemplate;

import java.util.List;

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
