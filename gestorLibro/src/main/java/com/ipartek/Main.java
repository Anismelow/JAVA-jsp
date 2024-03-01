package com.ipartek;

import java.io.IOException;
import java.util.concurrent.Flow.Publisher;

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

		String isbn = "";
		if(request.getParameter("isbn") != null) {
			isbn = request.getParameter("isbn");
		}
		
		String title = "";
		if(request.getParameter("title")!= null) {
            title = request.getParameter("title");
        }
		
		String author = "";
		if(request.getParameter("author")!= null) {
			author = request.getParameter("author");
        }
		
        String editorial = "";
        if(request.getParameter("publisher")!= null) {
            editorial = request.getParameter("publisher");
        }
        
        int pages = 0;
        if(request.getParameter("pages")!= null) {
        	pages = Integer.parseInt(request.getParameter("pages"));
        }
        
        boolean  tapadura = false;
        if(request.getParameter("tapadura")!= null) {
            tapadura = Boolean.parseBoolean(request.getParameter("tapadura"));
        }
     
        System.out.println(isbn + " " + title + " " + author + " " + editorial + " " + pages + " " + tapadura );
        
        
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitle(title);
        libro.setAuthor(author);
        libro.setPublisher(editorial);
        libro.setPages(pages);
        libro.setHardcover(tapadura);
        
        
        request.setAttribute("libro", libro);
        request.getRequestDispatcher("libro.jsp").forward(request, response);

		
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
