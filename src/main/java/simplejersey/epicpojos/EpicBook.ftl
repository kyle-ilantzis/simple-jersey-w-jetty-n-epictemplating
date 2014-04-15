<#-- A BeanTemplate ftl file has access to it's instance properties directly -->
<h1>${ title }</h1>
<ul>
    <#list authors as author>
        <li>${ author }</li>
    </#list>
</ul>
<p>${ description }</p>