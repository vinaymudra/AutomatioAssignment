package com.creatio.crm.language.assignment;

public class EmpGroups {

	public static void main(String[] args) {

		Employes obj = new Employes();  //Creating an Object and calling the Employees class

		String[] name = new String[3];  //Creating an String Array to declear the number of employees
		int[] id = new int[3];          //Creating an int Array to declare the number of employees ID's

		name[0] = obj.employeName1;
		name[1] = obj.employeName2;
		name[2] = obj.employeName3;

		id[0] = obj.employeID1;
		id[1] = obj.employeID2;
		id[2] = obj.employeID3;

		System.out.println("Employee Name:" + name[0] + "Employee ID:" + id[0]);
		System.out.println("Employee Name:" + name[1] + "Employee ID:" + id[1]);
		System.out.println("Employee Name:" + name[2] + "Employee ID:" + id[2]);

	}

}
