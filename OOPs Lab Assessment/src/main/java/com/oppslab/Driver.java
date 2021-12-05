package com.oppslab;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment ad = new AdminDepartment(); // OBJECT CREATION
		ad.departmantName();
		ad.getTodaysWork();
		ad.getWorkDeadline(); // METHOD OVERLOADING
		holiday(); // METHOD OVERRIDING
		System.out.println("---------------------------");
		HRDepartment hd = new HRDepartment();
		hd.departmantName();
		hd.getTodaysWork(); // DISPLAYING METHOD FUNCTIONALITIES BY USING ITS OBJECT
		hd.getWorkDeadline();
		hd.doActivity();
		holiday();
		System.out.println("---------------------------");
		TechDepartment td = new TechDepartment();
		td.departmantName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStachInformation();
		holiday();
		System.out.println("---------------------------");
	}

	static void holiday() {
		System.out.println("Today is not a holiday"); // DISPLAYIMG "TODAY IS NOT A HOLIDAY WITHOUT THE HELP OF SUPER
														// CLASS
	}

}
