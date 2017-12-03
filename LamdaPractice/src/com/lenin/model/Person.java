package com.lenin.model;

public class Person {
	
	private String persionId;
	private String firstName;
	private String lastName;
	
	public Person() { }
	
	public Person(String id , String fname, String lname) {
		this.persionId = id;
		this.firstName = fname;
		this.lastName =lname;
	}
	
	public String getPersionId() {
		return persionId;
	}
	public void setPersionId(String persionId) {
		this.persionId = persionId;
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
		lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person [persionId=" + persionId + ", firstName=" + firstName + ", LastName=" + lastName + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((persionId == null) ? 0 : persionId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (persionId == null) {
			if (other.persionId != null)
				return false;
		} else if (!persionId.equals(other.persionId))
			return false;
		return true;
	}
	
	
	
	

}
