<%@ page import="org.gerdoc.service.AlumnoService" %>
<%@ page import="org.gerdoc.service.impl.AlumnoServiceImpl" %>
<%@ page import="org.gerdoc.model.Alumno" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>BIENVENIDO</h1>
    <%
        AlumnoService alumnoService = new AlumnoServiceImpl( );
        List<Alumno> alumnos = alumnoService.findAll( );
    %>
    <button type="button" class="btn btn-success mb-3" data-bs-toggle="modal" data-bs-target="#alumnoModal" onclick="nuevoAlumno()" >
            Agregar alumno
        </button>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>