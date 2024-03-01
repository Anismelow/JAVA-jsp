package com.ipartek;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Pelicula")
public class Pelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Pelicula() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = "";
		if (request.getParameter("title") != null) {
			title = request.getParameter("title");
		}
		String director = "";
		if (request.getParameter("director")!= null) {
            director = request.getParameter("director");
        }
		int duration = 0; 
		if (request.getParameter("duration")!= null) {
            duration = Integer.parseInt(request.getParameter("duration"));
        }
		String ageRecommended = "";
		if(request.getParameter("ageRecommended")!=null) {
			ageRecommended = request.getParameter("ageRecommended");
		}
		int rating = 0;
		if(request.getParameter("rating")!=null) {
            rating = Integer.parseInt(request.getParameter("rating"));
        }
		
		System.out.println(title + " " + director + " " + duration + " "  + " " + ageRecommended + " " + rating);
		
		PeliculaDataPersistence pelicula = new PeliculaDataPersistence();
		pelicula.setTitle(title);
		pelicula.setDirector(director);
		pelicula.setDuration(duration);
		pelicula.setAgeRecommended(ageRecommended);
		pelicula.setRating(rating);
		
        request.setAttribute("pelicula", pelicula);
        request.getRequestDispatcher("pelicula.jsp").forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
