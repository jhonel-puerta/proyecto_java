<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./vistas/home.jsp">
            <h1>Login</h1> <br>
            <input class="form-control" type="text" name="nameUser" placeholder="nobre"><br>
            <input class="form-control" type="password" name="password" placeholder="contraseña"> <br>
            <input class="btn btn-primary" type="submit" value="ingresar">
        </form>
    </body>
</html>
