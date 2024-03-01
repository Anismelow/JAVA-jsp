<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }

    .container {
        max-width: 600px;
        margin: 20px auto;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
    }

    h1, h2 {
        text-align: center;
        margin-top: 0;
    }

    form {
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }

    input[type="text"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    .movie-info {
        background-color: #f9f9f9;
        border: 1px solid #ccc;
        border-radius: 4px;
        padding: 20px;
    }

    .movie-info p {
        margin: 0;
    }

</style>
<body>


 <div class="container">

  <h2>Película Information</h2>
  <form action="Pelicula" method="post">
    <label for="title">Título:</label>
    <input type="text" id="title" name="title">

    <label for="director">Director:</label>
    <input type="text" id="director" name="director">

    <label for="duration">Duración en minutos:</label>
    <input type="number" id="duration" name="duration">

    <label for="age_recommended">Edad recomendada:</label>
    <input type="text" id="age_recommended" name="age_recommended">

    <label for="rating">Nota:</label>
    <input type="number" id="rating" name="rating" min="1" max="10">

    <input type="submit" value="Submit">
  </form>
  
  <div class="movie-info">
    <h1>Información de la Película</h1>
    <p>Título: ${pelicula.title}</p>
    <p>Director: ${pelicula.director}</p>
    <p>Duración en minutos: ${pelicula.duration}</p>
    <p>Edad recomendada: ${pelicula.ageRecommended}</p>
    <p>Nota: ${pelicula.rating}</p>
  </div>

</div>

</body>
</html>