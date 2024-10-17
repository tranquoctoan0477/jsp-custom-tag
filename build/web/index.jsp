<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1><ex:SubTotal currency="vi" quantity="10" price="100" /></h1>
        <h1><ex:SubTotal currency="us" quantity="20" price="150" /></h1>
    </body>
</html>
