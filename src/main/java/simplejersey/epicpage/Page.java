package simplejersey.epicpage;

import epic.templating.BeanTemplate;
import epic.templating.Element;

/**
 * This example demonstrates an over architectured composite pattern to render web pages.
 * A Page is a BeanTemplate which is an Element.
 * A BeanTemplate knows how to render itself. see Page.ftl
 */
public class Page implements BeanTemplate {

    private Element style;
    private Element script;
    private Element body;

    public Page() {
    }

    public Element getStyle() {
        return style;
    }

    public void setStyle( Element style ) {
        this.style = style;
    }

    public Element getScript() {
        return script;
    }

    public void setScript( Element script ) {
        this.script = script;
    }

    public Element getBody() {
        return body;
    }

    public void setBody( Element body ) {
        this.body = body;
    }

    public static Page ok( String title, Element content ) {

        Body b = new Body();
        b.setTitle( title );
        b.setContent( content );

        Page p = new Page();
        p.setBody( b );

        return p;
    }
}
