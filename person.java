package assignment;

import java.time.LocalDate;

public class person {
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String cityName;
	private String provinceName;
	private String postalCode;
	private LocalDate dateOfBirth;
	
	public person(String first, String last, String street, String city,
			String province, String postal, LocalDate dob)
	{
		 firstName = first;
	     lastName = last;
	     streetAddress = street;
	     cityName = city;
	     provinceName = province;
	     setpostalCode(postal);
	     dateOfBirth = dob;
	     
	}
	private void setpostalCode(String postal){
		int count = postalCode.length();
		if (count >= 6)
			postalCode = postal;
		else
			throw new IllegalArgumentException("The postal code should contains 6 characters");
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public String getCityName() {
		return cityName;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getAge()
	{
		LocalDate today = LocalDate.now();
		int birthYear = dateOfBirth.getYear();
		int thisYear = today.getYear();
	    int age = thisYear - birthYear;
	    return age;
	}

	public String getFullAddress()
	{
		return streetAddress + "," + cityName + "," + provinceName + "," + postalCode;
	}
	
}

