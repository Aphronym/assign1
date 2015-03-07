<%-- 
    Document   : AddPost
    Created on : Mar 5, 2015, 10:01:01 PM
    Author     : ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Post</title>
    </head>
    <body>
        <form action="CreatePost" method="POST">
            Enter Comments Here:<br />
            <textarea cols="50" rows="20" name="userPost"></textarea><br />
            <input type="submit" value="Submit" />
            <a href="ShowPost.jsp">View Posts</a>
        </form>
    </body>
</html>
