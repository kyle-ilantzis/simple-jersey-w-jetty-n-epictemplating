<#-- A BeanTemplate ftl file has access to it's instance properties directly -->
<!doctype html>
<html>
<head>
    <#if style??>
        <style type="text/css">
            <@element bean=style/>
        </style>
    </#if>
    <#if script??>
        <script type="text/javascript">
            <@element bean=script/>
        </script>
    </#if>
</head>
<body>
    <@element bean=body/>
</body>
</html>