<!doctype html>
<html>
<head>
</head>
<body>
    <h1>Plain Books</h1>
    <h2>epic-templating at its finest</h2>

    <#if books?size == 0 >
        <p>Looks like there are no books.</p>
    <#else>
        <ul>
            <#list books as book>
                <li>
                    <h3><a href="book/${ book.id }">${ book.title }</a></h3>
                    <ul>
                        <#list book.authors as author>
                            <li>${ author }</li>
                        </#list>
                    </ul>
                </li>
            </#list>
        </ul>
    </#if>
</body>
</html>