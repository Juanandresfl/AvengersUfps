<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta http-equiv="X-UA-Compatible" content="ie=edge">

  	<title>Editar Informacion</title>
  	
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
  
    <h1 align="center">Editar Informacion de Heroes</h1>
    <div class="container">
       <form action="EditarHeroeController" method="post">
       <input style="display: none"
						value="<%=request.getParameter("id")%>" name="id"></input>
         <div class="form-group row">
           <label for="exampleInputText1">Nombre</label>
           <input type="text" class="form-control" id="exampleInputText1" aria-describedby="emailHelp" name="nombre">
         </div>
         <div class="form-group row">
           <label for="exampleInputText1">Heroe</label>
           <input type="text" class="form-control" id="exampleInputText1" name="heroe">
         </div>
         <div class="form-group row">
           <label for="exampleInputText1">Genero</label>
           <input type="text" class="form-control" id="exampleInputText1" name="genero" placeholder="A,E,H o M">
         </div>
          <div class="form-group row">
           <label for="exampleInputText1">Estado</label>
           <input type="text" class="form-control" id="exampleInputText1" name="estado"placeholder="A,D,R o X">
         </div>
          <div class="form-group row">
           <label for="exampleInputText1">Descripcion</label>
           <input type="text" class="form-control" id="exampleInputText1" name="descripcion">
         </div>
          <div class="form-group row">
           <label for="exampleInputText1">Arma</label>
           <input type="text" class="form-control" id="exampleInputText1" name="arma">
         </div>
         <button type="submit" class="btn btn-primary">Enviar</button>
       </form>
      </div>
  </body>
</html>