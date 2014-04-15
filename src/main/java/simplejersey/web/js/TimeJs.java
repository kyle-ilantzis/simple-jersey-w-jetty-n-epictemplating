package simplejersey.web.js;

import epic.templating.BeanTemplate;

/**
 * This example demonstrates an over architectured composite pattern to render web pages.
 * A TimeJs is a BeanTemplate which is an Element.
 * A BeanTemplate knows how to render itself. see TimeJs.ftl
 */
public class TimeJs implements BeanTemplate {

    public static final TimeJs INSTANCE = new TimeJs();

    private TimeJs(){}
}
