<%-- 
    Document   : listar
    Created on : 27/11/2020, 02:29:18 PM
    Author     : cieli
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="modeloDAO.personaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body class="cont">
        <header>
            <h1>PANEL DE CONTROL</h1>
        </header>
        <a class="btn-agregar" href="./Controlador?accion=add" >Nuevo Alumno</a>
        <table border="1" class="table table-bordered">
            <thead>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">NOMBRES</th>
                    <th class="text-center">APELLIDOS</th>
                    <th class="text-center">NOTA-01</th>
                    <th class="text-center">NOTA-02</th>
                    <th class="text-center">PROMEDIO</th>
                    <th class="text-center">ACCIONES</th>
                </tr>
            </thead>
            <%
                personaDAO dao = new personaDAO();
                List<Persona>list=dao.listar();
                Iterator<Persona> iterator= list.iterator();
                Persona p = null;
                while(iterator.hasNext()){
                    p = iterator.next();
                
            %>
            <tbody>
                <tr>
                    <td class="text-center"><%=p.getId()%></td>
                    <td class="text-center"><%=p.getNombre()%></td>
                    <td class="text-center"><%=p.getApellidos()%></td>
                    <td class="text-center"><%=p.getNota1()%></td>
                    <td class="text-center"><%=p.getNota2()%></td>
                    <td class="text-center"><%=p.getPromedio()%></td>
                    <td class="text-center">
                        <a class="btn btn-warning" href="Controlador?accion=editar&id=<%=p.getId()%>">editar</a>
                        <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%=p.getId()%>">eliminar</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>

        
    </body>
</html>
