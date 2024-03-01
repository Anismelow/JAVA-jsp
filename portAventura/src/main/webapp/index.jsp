<%@page import="com.ipartek.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f5f5f5;
        color: #333;
    }
    .container {
        max-width: 800px;
        margin: 20px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1, h2 {
        text-align: center;
    }
    form {
        margin-bottom: 20px;
    }
    label {
        font-weight: bold;
    }
    input[type="text"],
    input[type="email"],
    input[type="number"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
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
    .aptitud {
        margin-top: 20px;
    }
    .atraccion {
        font-weight: bold;
    }
    .apto {
        color: #4CAF50;
    }
    .no-apto {
        color: #f44336;
    }
</style>
<body>

<%
Persona persona = new Persona();
if(request.getAttribute("atr_persona")!=null){
	persona=(Persona)request.getAttribute("atr_persona");
}

String aptitudDragonKhan = (persona.getAge() > 16 && persona.getHeight() > 1.40 && persona.getWeight() > 60) ? "Apto" : "No apto";
String aptitudTutukiSplash = (persona.getAge() > 12 && persona.getHeight() > 0.9) ? "Apto" : "No apto";
String aptitudDiablo = (persona.getAge() > 14 && persona.getHeight() > 1.20) ? "Apto" : "No apto";
String aptitudSaloon = (persona.getAge() > 18) ? "Apto" : "No apto";
String aptitudTxikipark = ((persona.getAge() >= 3 && persona.getAge() <= 12) && (persona.getHeight() <= 1.40)) ? "Apto" : "No apto";


%>   
   


  <body>

<div class="container">
    <h1>Parque de Atracciones</h1>

    <h2>User Information</h2>
    <form action="Main" method="post">
        <label for="name">Nombre:</label><br>
        <input type="text" id="name" name="name"><br>

        <label for="lastName">Apellidos:</label><br>
        <input type="text" id="lastName" name="lastName"><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email"><br>

        <label for="age">Edad:</label><br>
        <input type="number" id="age" name="age"><br>

        <label for="weight">Peso:</label><br>
        <input type="number" id="weight" name="weight"><br>

        <label for="height">Altura:</label><br>
        <input type="number" id="height" name="height" step="0.01"><br>

        <input type="submit" value="Submit">
    </form>

    <div class="aptitud">
        <h2>Aptitud para montarse en las atracciones:</h2>

        <p class="atraccion">Dragon Khan: <span class="<%= aptitudDragonKhan.equals("Apto") ? "apto" : "no-apto" %>"><%= aptitudDragonKhan %></span></p>
        <p class="atraccion">Tutuki Splash: <span class="<%= aptitudTutukiSplash.equals("Apto") ? "apto" : "no-apto" %>"><%= aptitudTutukiSplash %></span></p>
        <p class="atraccion">Diablo: <span class="<%= aptitudDiablo.equals("Apto") ? "apto" : "no-apto" %>"><%= aptitudDiablo %></span></p>
        <p class="atraccion">Saloon: <span class="<%= aptitudSaloon.equals("Apto") ? "apto" : "no-apto" %>"><%= aptitudSaloon %></span></p>
        <p class="atraccion">Txikipark: <span class="<%= aptitudTxikipark.equals("Apto") ? "apto" : "no-apto" %>"><%= aptitudTxikipark %></span></p>
    </div>
</div>  
  


</body>
</html>