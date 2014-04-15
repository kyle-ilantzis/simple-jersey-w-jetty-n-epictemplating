Simple Jersey with jetty and Epic Templating

Similar to "simple-jersey-w-jetty". This template project demonstrates Epic Templating which can be found at
https://github.com/eric-poitras/epic-templating.

In simplejersey/App.java you can find code that bootstraps an Epic Templating rendering engine.

Two main important concepts are demonstrated in this template project. They are MapTemplate and BeanTemplate object
instances.

The MapTemplate is demonstrated by simplejersey/resources/plain/PlainResource.java where the member functions of
PlainResource return Elements that are instances of MapTemplate.

The BeanTemplate is demonstrated by simplejersey/resources/plain/EpicResource.java where the member function of
EpicResource returns an Element that is an instance of simplejersey/epicpage/Page.java. Page.java is an over
architectured example of using Elements and the Composite design pattern.