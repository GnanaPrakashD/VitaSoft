package com.vitasoft.bean;

public class StudentVita {
private String FirstName;
private String LastName;
private String MiddleName;
private String Address;
private String Email;
private String PhoneNumber;
private String Height;
private String Weight;

public StudentVita() {
	super();
}

public StudentVita(String firstName, String lastName, String middleName, String address, String email,
		String phoneNumber, String height, String weight) {
	super();
	FirstName = firstName;
	LastName = lastName;
	MiddleName = middleName;
	Address = address;
	Email = email;
	PhoneNumber = phoneNumber;
	Height = height;
	Weight = weight;
}

public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getMiddleName() {
	return MiddleName;
}
public void setMiddleName(String middleName) {
	MiddleName = middleName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getHeight() {
	return Height;
}
public void setHeight(String height) {
	Height = height;
}
public String getWeight() {
	return Weight;
}
public void setWeight(String weight) {
	Weight = weight;
}

}
