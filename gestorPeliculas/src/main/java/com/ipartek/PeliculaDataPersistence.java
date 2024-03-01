package com.ipartek;

public class PeliculaDataPersistence {
	
	private String title;
    private String director;
    private int duration;
    private String ageRecommended;
    private int rating;
    
    
    public PeliculaDataPersistence() {
    	
    }
    
    
	public PeliculaDataPersistence(String title, String director, int duration, String ageRecommended, int rating) {
		super();
		this.title = title;
		this.director = director;
		this.duration = duration;
		this.ageRecommended = ageRecommended;
		this.rating = rating;
	}

	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getAgeRecommended() {
		return ageRecommended;
	}


	public void setAgeRecommended(String ageRecommended) {
		this.ageRecommended = ageRecommended;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "PeliculaDataPersistence [title=" + title + ", director=" + director + ", duration=" + duration
				+ ", ageRecommended=" + ageRecommended + ", rating=" + rating + "]";
	}

   
   
}
