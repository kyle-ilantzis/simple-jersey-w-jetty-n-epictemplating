package simplejersey.web.css;

import epic.templating.BeanTemplate;

/**
 * This example demonstrates an over architectured composite pattern to render web pages.
 * A EpicStyle is a BeanTemplate which is an Element.
 * A BeanTemplate knows how to render itself. see EpicStyle.ftl
 */
public class EpicStyle implements BeanTemplate {

    public static final EpicStyle INSTANCE = new EpicStyle();

    private EpicStyle(){}
}
