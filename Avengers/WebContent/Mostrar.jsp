<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta http-equiv="X-UA-Compatible" content="ie=edge">

  	<title>Informacion Heroe</title>

  	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
<body>

 			<header>
				<nav class="navbar navbar-light bg-danger">
					<a class="navbar-brand" href="index.jsp"> <img
						src="https://vignette.wikia.nocookie.net/avengersalliance/images/c/c2/Vengadores.png/revision/latest?cb=20121117151146&path-prefix=es"
						width="30" height="30" class="d-inline-block align-top" alt="">
						AVENGERS
					</a>

				</nav>
		</div>
		</header>

<jsp:useBean id="hDao" class="services.HeroeDao" scope="request"></jsp:useBean>
<table class="table table-striped">
  <thead>

    <tr>
      <th scope="col">id</th>
      <th scope="col">nombre</th>
      <th scope="col">heroe</th>
      <th scope="col">fecha nacimiento</th>
      <th scope="col">fecha aparicion</th>
      <th scope="col">genero</th>
      <th scope="col">estado</th>
      <th scope="col">descripcion</th>
      <th scope="col">arma</th>
      <th scope="col">informacion</th>
       <th scope="col">eliminar</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="heroes" items="${hDao.list()}">
    <input style="display:none" value="${heroes.id}">
    <tr>
      <td>${heroes.id}</td>
      <td>${heroes.nombre}</td>
      <td>${heroes.heroe}</td>
      <td>${heroes.fechanacimiento}</td>
      <td>${heroes.fechaaparicion}</td>
      <td>${heroes.generoBean.getId()}</td>
      <td>${heroes.estadoBean.getId()}</td>
      <td>${heroes.descripcion}</td>
      <td>${heroes.arma}</td>
      <td><a href="Editar.jsp?id=${heroes.id}"><button class="btn btn-info" >Editar informacion</button></a></td>
      <td><a href="EliminarHeroeController?id=${heroes.id}"><button class="btn btn-danger" >Eliminar Heroe</button></a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>