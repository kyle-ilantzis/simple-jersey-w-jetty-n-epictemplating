<#-- A BeanTemplate ftl file has access to it's instance properties directly -->
<#if books?size == 0 >
    <p>Looks like there are no books.</p>
<#else>
    <ul>
        <#list books as book>
            <li>
                <@element bean=book/>
            </li>
        </#list>
    </ul>
</#if>