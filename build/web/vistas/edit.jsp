<%-- 
    Document   : edit
    Created on : 27/11/2020, 11:32:30 AM
    Author     : cieli
--%>

<%@page import="Modelo.Persona"%>
<%@page import="modeloDAO.personaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Editar Alumno</title>
    </head>
    <body>
        
        <%
            personaDAO dao= new personaDAO();
            int id = Integer.parseInt((String)request.getAttribute("id"));
            Persona p=(Persona)dao.list(id);
        %>
        
        <div class="container">
            <div class="col-lg-6">
        
        <h1>EDITAR ALUMNO</h1>
        
        <form>
            <input class="form-control" name="nombres" placeholder="nombres" type="text" value="<%=p.getNombre()%>">
            <input class="form-control" name="apellidos" placeholder="apellidos" type="text" value="<%=p.getApellidos()%>">
            <input class="form-control" name="nota1" placeholder="nota 01" type="text" value="<%=p.getNota1()%>">
            <input class="form-control" name="nota2" placeholder="nota 02" type="text" value="<%=p.getNota2()%>">
            <input class="form-control" type="hidden" name="txtid" value="<%=p.getId()%>">
            <input class="btn btn-primary" name="accion" value="Actualizar" type="submit">
        </form>
            </div>
        </div>
    </body>
</html>
