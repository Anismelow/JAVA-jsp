package com.ipartek;

public class Libro {
	
	private String isbn;
	private String title;
	private String author;
	private int pages;
	private String publisher;
	private boolean hardcover ;
	
	
	public Libro(){
		
	}
	
	
	
	public Libro(String isbn, String title, String author, int pages, String publisher, boolean hardcover) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.publisher = publisher;
		this.hardcover = hardcover;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public boolean isHardcover() {
		return hardcover;
	}
	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
	}



	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", title=" + title + ", author=" + author + ", pages=" + pages + ", publisher="
				+ publisher + ", hardcover=" + hardcover + "]";
	}
	
	
	
	
	
	
}
