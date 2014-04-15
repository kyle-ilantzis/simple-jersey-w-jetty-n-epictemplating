package simplejersey.epicpage;

import epic.templating.BeanTemplate;
import epic.templating.Element;

/**
 * This example demonstrates an over architectured composite pattern to render web pages.
 * A Body is a BeanTemplate which is an Element.
 * A BeanTemplate knows how to render itself. see Body.ftl
 */
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
