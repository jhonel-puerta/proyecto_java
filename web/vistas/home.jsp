<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/Style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/index.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <header class="header-home">
            <h3 class="logo">Old School</h3>
            <nav>
                <a class="listar-alumnos" href="../Controlador?accion=listar">Alumnos</a>
                <a class="cerrar-sesion" href="../login.jsp">Cerrar sesión</a>
            </nav>
            
        </header>
        
        <main>
            <div class="data-user">
                <div class="foto-user"></div>
                <h1 class="name-user">JOHN ANDRES WAGNER MENDOZA</h1>
                <div class="info">
                    <h3>jwagner@senati.pe</h3>
                </div>
            </div>
            
            <div class="cursos">
                <div class="curso1"></div>
                <div class="curso2"></div>
                <div class="curso3"></div>
                <div class="curso4"></div>
                <div class="curso5"></div>
                <div class="curso6"></div>
            </div>
        </main>
    </body>
</html>
