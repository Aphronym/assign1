<%-- 
    Document   : login
    Created on : Mar 6, 2015, 7:17:22 PM
    Author     : ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <div>
            <form action="loginHandler" method="POST">
                <table>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="user" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="pass" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                    </tr>
                </table>
            </form>
        </div>
        
    </body>
</html>
