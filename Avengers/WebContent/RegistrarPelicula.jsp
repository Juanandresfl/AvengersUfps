<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta http-equiv="X-UA-Compatible" content="ie=edge">

  	<title>Registrar Pelicula</title>

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
    <h1 align="center">Registro de Peliculas</h1>
    <div class="container">
       <form action="RegistrarPeliculaController" method="post">
         <div class="form-group row">
           <label for="exampleInputText1">Nombre Pelicula</label>
           <input type="text" class="form-control" id="exampleInputText1" aria-describedby="emailHelp" name="nombre">
         </div>
         <div class="form-group row">
           <label for="exampleInputText1">Sinopsis</label>
           <input type="text" class="form-control" id="exampleInputText1" name="sinopsis">
         </div>
         <div class="form-group row">
           <label for="exampleInputText1">Clasificacion</label>
           <input type="text" class="form-control" id="exampleInputText1" name="clasificacion" placeholder="A,o N">
         </div>
         <div class="form-group row">
           <label for="example-date-input">A�o de secuencia</label>
          <input class="form-control" id="exampleInputText1" type="text" name="fechaS">
          </div>
        <div class="form-group row">
          <label for="example-date-input">a�o de lanzamiento</label>
         <input class="form-control" id="exampleInputText1" type="text" name="fechaL">
         </div>
      <br>
         <button type="submit" class="btn btn-primary">Enviar</button>
       </form>
      </div>
  </body>
</html>