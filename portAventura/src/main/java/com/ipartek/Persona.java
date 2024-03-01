package com.ipartek;

public class Persona {

	 private String name;
	    private String lastName;
	    private String email;
	    private int age;
	    private int weight;
	    private double height;
	    
	    public Persona() {
	    	
	    }
	    
	    
	   
	   
		public Persona(String name, String lastName, String email, int age, int weight, double height) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.age = age;
			this.weight = weight;
			this.height = height;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

		
		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}

		
		public int getWeight() {
			return weight;
		}


		public void setWeight(int weight) {
			this.weight = weight;
		}


		public double getHeight() {
			return height;
		}


		public void setHeight(double height) {
			this.height = height;
		}


		@Override
		public String toString() {
			return "Persona [name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age
					+ ", weight=" + weight + ", height=" + height + "]";
		}
	    
	    
}
