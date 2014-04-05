package simplejersey.pojos;

import java.util.List;

public class PlainBook {

    private String title;
    private List<String> authors;
    private String description;

    public PlainBook() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors( List<String> authors ) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }
}
