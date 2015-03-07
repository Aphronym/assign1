<%-- 
    Document   : ShowPost
    Created on : Mar 5, 2015, 8:48:00 PM
    Author     : ronald
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body>
        
        <div>
            <c:set var="posts" value="${posts}" />
            <c:set var="postLength" value="${fn:length(posts)}" />
            <c:forEach items="${posts}" varStatus="status">
                ${posts[postLength - status.count]}<br />
            </c:forEach>      
        </div>
        
        <a href="AddPost.jsp">Add A New Post</a>
    </body>
</html>
