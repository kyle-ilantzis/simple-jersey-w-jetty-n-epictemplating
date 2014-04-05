package simplejersey.epicpage;

import epic.templating.BeanTemplate;
import epic.templating.Element;

public class Body implements BeanTemplate {

    private String  title;
    private Element content;

    public Body() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public Element getContent() {
        return content;
    }

    public void setContent( Element content ) {
        this.content = content;
    }
}
