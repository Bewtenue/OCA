package com.softpath.collections;

public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (obj == null || obj.getClass() != this.getClass()) {
	            return false;
	        }

	        Person guest = (Person) obj;
	        return id == guest.id && (this.firstName == guest.firstName || (this.firstName != null && this.firstName.equals(guest.getFirstName())))
	                && (this.lastName == guest.lastName || (this.lastName != null && this.lastName.equals(guest.getLastName())));
	    }
	    
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result
	                + ((firstName == null) ? 0 : firstName.hashCode());
	        result = prime * result + id;
	        result = prime * result
	                + ((lastName == null) ? 0 : lastName.hashCode());
	        return result;
	    }
	
	public static void main(String[] args) {
	
		Person persona1 = new Person ();
		Person persona2 = new Person();
		persona1.setFirstName("Jesus");
		persona2.setFirstName("Jesus");
		
		System.out.println(persona1.equals(persona2));
		
	}
	
}
