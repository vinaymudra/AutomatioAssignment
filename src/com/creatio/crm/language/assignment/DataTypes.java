package com.creatio.crm.language.assignment;

public class DataTypes {

	public static void main(String[] args) {
		// 1. Temperature of a city in degrees Celsius: 25.5
		float temperature = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius:" + 25.5f);

		// 2. Whether a customer has placed an order: true or false
		boolean customerOrder = true;
		System.out.println("Whether a customer has placed an order:" + customerOrder);

		// 3. Person's phone number: "123-456-7890"
		String phoneNumber = "123-456-7890";
		System.out.println("Person's phone number:" + phoneNumber);

		/*
		 * 4. Amount of money in a customer's bank account: 1000.50 Amount is in decimal
		 * so we store it as a float or double
		 */
		double amount = 1000.50;
		System.out.println("Amount of money in a customer's bank account :" + amount);

		/*
		 * 5. Person's email address: "john.doe@example.com" Email is stored in String
		 */
		String email = "john.doe@example.com";
		System.out.println("Person's email address:" + email);

		/*
		 * 6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		 * decimal can be stored in float or double
		 */

		float latitude = 34.7729f;
		double longitude = -122.4194;
		System.out.println("latitude:" + latitude + ",longitude:" + longitude);

		/*
		 * 7. Person's marital status: true or false boolean is used to store true of
		 * false
		 */
		boolean status = false;
		System.out.println("Person's marital status:" + status);

		/*
		 * 8. Person's occupation: "Software Engineer" String is used to store the
		 * occupation
		 */
		String occupation = "Software Engineer";
		System.out.println("Person's occupation:" + occupation);

		// 9. Person's favourite colour: "Blue"
		String colour = "Blue";
		System.out.println(" Person's favourite colour:" + colour);

		// 10.Current year: 2023
		int year = 2023;
		System.out.println("Current year:" + year);

		// 11.Number of followers on a social media platform: 1,000,000
		int followers = 1000000;
		System.out.println("Number of followers on a social media platform:" + followers);

		/*
		 * 12.Rating of a movie: 7.5 decimal numbers can be stored in float or double
		 */
		float rating = 7.5f;
		System.out.println("Rating of a movie:" + rating);

		/*
		 * 13.Person's blood type: 'A' A can be stored in Character
		 */

		char type = 'A';
		System.out.println("Person's blood type:" + type);

		// 14.Title of a book: "To Kill a Mockingbird"
		String title = "To Kill a Mockingbird";
		System.out.println("Title of a book:" + title);

		// 15.Number of employees in a company: 500
		int number = 500;
		System.out.println("Number of employees in a company:" + number);

		// 16.Time of an event: 2:30 PM
		String time = "2:30 PM";
		System.out.println("Time of an event:" + time);

		// 17.Name of a country: "United States"
		String name = "United States";
		System.out.println("Name of a country:" + name);

		// 18.Person's eye color: "Brown"
		String color = "Brown";
		System.out.println("Person's eye color:" + color);

		// 19.Person's birthplace: "New York City"
		String place = "New York City";
		System.out.println("Person's birthplace:" + place);

		// 20. Distance between two cities: 200.5
		double distance = 200.5;
		System.out.println("Distance between two cities:" + distance);
	}

}
