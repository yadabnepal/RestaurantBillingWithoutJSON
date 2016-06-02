<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html >
    <head lang="en">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    <spring:url value="/resources/css/style.css" var="style" />
    <link rel="stylesheet" href="${style}">
    </head>
   
    <body>
     <jsp:doBody/>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <spring:url value="/resources/js/index.js" var="indexJS" />
    <style src="${indexJS}"></style>
    </body>
</html>