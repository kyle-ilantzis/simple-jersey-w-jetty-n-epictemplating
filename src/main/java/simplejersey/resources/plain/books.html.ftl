<!doctype html>
<html>
<head>
</head>
<body>
    <h1>Plain Books</h1>
    <h2>epic-templating at its finest</h2>

    <#if books?empty #>
        <p>Looks like there are no books.</p>
    <#elseif>
        <ul>
            <#for book in books>
                <li>
                    <h3>${ book.title }</h3>
                    <ul>
                        <#for author in book.authors>
                            <li>${ author }</li>
                        </#for>
                    </ul>
                </li>
            </#for>
        </ul>
    </#if>
</body>
</html>