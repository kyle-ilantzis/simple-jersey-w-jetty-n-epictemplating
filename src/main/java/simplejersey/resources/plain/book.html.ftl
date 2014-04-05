<!doctype html>
<html>
<head>
</head>
<body>
    <h1>${ book.title }</h1>
    <ul>
        <#list book.authors as author>
            <li>${ author }</li>
        </#list>
    </ul>
    <p>${ book.description }</p>
</body>
</html>