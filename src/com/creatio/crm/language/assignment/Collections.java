package com.creatio.crm.language.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {

		System.out.println("-------------------STUDENT---------------------");

		Map<String, String> student1Map = new HashMap<String, String>();
		student1Map.put("Name", "John Doe");
		student1Map.put("Age", "20");
		student1Map.put("Gender", "Male");
		student1Map.put("Roll Number", "S1234");
		student1Map.put("Grade", "A");
		student1Map.put("Major", "Computer Science");
		student1Map.put("GAP", "3.8");
		student1Map.put("Emali", "John@example.com");
		student1Map.put("Contact Number", "999999777");
		student1Map.put("Address", "123 Elm Street");

		// System.out.println("Total Values in student1Map are :" + student1Map.size());
		System.out.println(student1Map);

		Map<String, String> student2Map = new HashMap<String, String>();
		student2Map.put("Name", "Jane Smith");
		student2Map.put("Age", "21");
		student2Map.put("Gender", "Female");
		student2Map.put("Roll Number", "S1235");
		student2Map.put("Grade", "B");
		student2Map.put("Major", "Mathematics");
		student2Map.put("GAP", "3.5");
		student2Map.put("Emali", "jane@example.com");
		student2Map.put("Contact Number", "9876665666");
		student2Map.put("Address", "456 Oak Street");

		// System.out.println("Total Values in student2Map are :" + student2Map.size());
		System.out.println(student2Map);

		Map<String, String> student3Map = new HashMap<String, String>();
		student3Map.put("Name", "Mike Brown");
		student3Map.put("Age", "22");
		student3Map.put("Gender", "Male");
		student3Map.put("Roll Number", "S1236");
		student3Map.put("Grade", "A");
		student3Map.put("Major", "Physic");
		student3Map.put("GAP", "3.9");
		student3Map.put("Emali", "mike@example.com");
		student3Map.put("Contact Number", "87878787");
		student3Map.put("Address", "789 Pin Street");

		// System.out.println("Total Values in student3Map are :" + student3Map.size());
		System.out.println(student3Map);

		System.out.println("--------------------Employee--------------------");

		Map<String, String> Employee1Details = new HashMap<String, String>();
		Employee1Details.put("Employe Id", "E001");
		Employee1Details.put("Name", "Alice Green");
		Employee1Details.put("Age", "30");
		Employee1Details.put("Gender", "Female");
		Employee1Details.put("Department", " Engineer");
		Employee1Details.put("Position", "Software Engineer");
		Employee1Details.put("Salary", "750000");
		Employee1Details.put("Emali", "alice@example.com");
		Employee1Details.put("Contact Number", "9876543215");

		// System.out.println("Total Values in Employee1Details are :" +
		// Employee1Details.size());
		System.out.println(Employee1Details);

		Map<String, String> Employee2Details = new HashMap<String, String>();
		Employee2Details.put("Employe Id", "E002");
		Employee2Details.put("Name", "Bob Johnson");
		Employee2Details.put("Age", "35");
		Employee2Details.put("Gender", "Male");
		Employee2Details.put("Department", " Marketing");
		Employee2Details.put("Position", "Marketing Manager");
		Employee2Details.put("Salary", "85000");
		Employee2Details.put("Emali", "Bob@example.com");
		Employee2Details.put("Contact Number", "9876543214");

		// System.out.println("Total Values in Employee2Details are :" +
		// Employee2Details.size());
		System.out.println(Employee2Details);

		Map<String, String> Employee3Details = new HashMap<String, String>();
		Employee3Details.put("Employe Id", "E003");
		Employee3Details.put("Name", "Carol White");
		Employee3Details.put("Age", "28");
		Employee3Details.put("Gender", "Female");
		Employee3Details.put("Department", " Sales");
		Employee3Details.put("Position", "Sales Executive");
		Employee3Details.put("Salary", "650000");
		Employee3Details.put("Emali", "carol@example.com");
		Employee3Details.put("Contact Number", "9876543216");

		// System.out.println("Total Values in Employee3Details are :" +
		// Employee3Details.size());
		System.out.println(Employee3Details);

		System.out.println("---------------------PRODUCT-------------------------");

		Map<String, String> Product1 = new HashMap<String, String>();
		Product1.put("Product ID", "POO1");
		Product1.put("Name", "Laptop");
		Product1.put("Category", "Electronics");
		Product1.put("Price", "$1200");
		Product1.put("Stock Quanitiy", "50");
		Product1.put("Supplier", "Tech Supplies");
		Product1.put("Warrant", "2 Years");
		Product1.put("Rating", "4.5");
		Product1.put("Manufacturing Date", "15-01-2023");
		Product1.put("Expiry Date", "15-01-2025");

		// System.out.println("Total Values in Product1 are :" + Product1.size());
		System.out.println(Product1);

		Map<String, String> Product2 = new HashMap<String, String>();
		Product2.put("Product ID", "POO2");
		Product2.put("Name", "Desk Chairs");
		Product2.put("Category", "Furniture");
		Product2.put("Price", "$150");
		Product2.put("Stock Quanitiy", "200");
		Product2.put("Supplier", "Office Deport");
		Product2.put("Warrant", "1 Years");
		Product2.put("Rating", "4");
		Product2.put("Manufacturing Date", "10-02-2023");
		Product2.put("Expiry Date", "N/A");

		// System.out.println("Total Values in Product2 are :" + Product2.size());
		System.out.println(Product2);

		Map<String, String> Product3 = new HashMap<String, String>();
		Product3.put("Product ID", "POO3");
		Product3.put("Name", "Coffee Maker");
		Product3.put("Category", "Kitchen");
		Product3.put("Price", "$75");
		Product3.put("Stock Quanitiy", "100");
		Product3.put("Supplier", "Kitchen World");
		Product3.put("Warrant", "6 Months");
		Product3.put("Rating", "4.2");
		Product3.put("Manufacturing Date", "20-03-2023");
		Product3.put("Expiry Date", "20-03-2025");

		// System.out.println("Total Values in Product3 are :" + Product3.size());
		System.out.println(Product3);

		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(student1Map);
		studentList.add(student2Map);
		studentList.add(student3Map);

		List<Map<String, String>> EmployeeDetails = new ArrayList<Map<String, String>>();
		EmployeeDetails.add(Employee1Details);
		EmployeeDetails.add(Employee2Details);
		EmployeeDetails.add(Employee3Details);

		List<Map<String, String>> ProductDetails = new ArrayList<Map<String, String>>();
		ProductDetails.add(Product1);
		ProductDetails.add(Product2);
		ProductDetails.add(Product3);
		
		
		Map<String,List<Map<String,String >>> data = new HashMap<String,List<Map<String,String >>>();
		data.put("Student Data", studentList);
		data.put("Product Data", ProductDetails);
		data.put("Employee Data", EmployeeDetails);
		
		System.out.println(data.get("Student Data").get(2).get("Major"));
		System.out.println(data.get("Employee Data").get(1).get("Position"));
		System.out.println(data.get("Product Data").get(0));
		
		

	}

}
