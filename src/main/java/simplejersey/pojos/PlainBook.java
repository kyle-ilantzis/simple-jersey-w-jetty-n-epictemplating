package simplejersey.pojos;

import java.util.List;

public class PlainBook {

    private Integer id;
    private String title;
    private List<String> authors;
    private String description;

    public PlainBook() {
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
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
