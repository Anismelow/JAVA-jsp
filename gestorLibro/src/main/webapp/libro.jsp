<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta charset="UTF-8">
<title>Insert title here</title>
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
    input[type="number"],
    input[type="checkbox"] {
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

    .book-info {
        background-color: #f9f9f9;
        border: 1px solid #ccc;
        border-radius: 4px;
        padding: 20px;
    }

    .book-info p {
        margin: 0;
    }

</style>
</head>

<body>

<div class="container">

  <h2>Book Information</h2>
  <form action="Main" method="post">
    <label for="isbn">ISBN:</label>
    <input type="text" id="isbn" name="isbn">

    <label for="title">Título:</label>
    <input type="text" id="title" name="title">

    <label for="author">Autor:</label>
    <input type="text" id="author" name="author">

    <label for="pages">Número de páginas:</label>
    <input type="number" id="pages" name="pages">

    <label for="publisher">Editorial:</label>
    <input type="text" id="publisher" name="publisher">

    <label for="hardcover">Tapadura:</label>
    <input type="checkbox" id="hardcover" name="hardcover">

    <input type="submit" value="Submit">
  </form>
  
  <div class="book-info">
    <h1>Información del Libro</h1>
    <p>ISBN: ${libro.isbn}</p>
    <p>Título: ${libro.title}</p>
    <p>Autor: ${libro.author}</p>
    <p>Editorial: ${libro.publisher}</p>
    <p>Número de páginas: ${libro.pages}</p>
    <p>Tapadura: ${libro.hardcover ? 'Sí' : 'No'}</p>
  </div>

</div>

</body>
</html>