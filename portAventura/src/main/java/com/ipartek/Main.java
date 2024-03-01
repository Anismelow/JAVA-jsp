package com.ipartek;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Main() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String name = "";
		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		}
		
		String lastName = "";
		if (request.getParameter("lastName")!= null) {
            lastName = request.getParameter("lastName");
        }
		
		String email = "";
		if (request.getParameter("email")!= null) {
            email = request.getParameter("email");
        }
		
		int age = 0;
		if (request.getParameter("age")!= null) {
            age = Integer.parseInt(request.getParameter("age"));
        }
		
		int weight = 0;
		if (request.getParameter("weight")!= null) {
            weight = Integer.parseInt(request.getParameter("weight"));
        }
		
        double height = 0;
        if (request.getParameter("height")!= null) {
            height = Double.parseDouble(request.getParameter("height"));
        }
        
        System.out.println(name + " " + lastName + " " + email + " " + age + " " + weight + " " + height + " ");
        
        Persona persona = new Persona(name, lastName, email, age, weight, height);
        System.out.println(persona);
        
        
        request.setAttribute("atr_persona", persona);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
