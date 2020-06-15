package studentDbApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private String firstName, lastName, id;
	private int balance = 0, grade;
	private static int courseCost = 600, nextId = 1000;
	private ArrayList<String> courses = new ArrayList<String>();
	
	//Constructor: Prompt for name and year
	public Student(){
		Scanner in  = new Scanner(System.in);
		System.out.print("\nEnter student's first name:\t");
		this.firstName = in.nextLine();
		System.out.print("Enter student's last name:\t");
		this.lastName = in.nextLine();
		System.out.print("Enter student's grade (1-4):\t");
		this.grade = Integer.parseInt(in.nextLine());
		setID();
		System.out.println("New Student Added:\nName:\t" + this.lastName + ", " 
							+ this.firstName + "\nID:\t" + this.id + "\n"
							+ "Grade:\t" + this.grade);
		//in.close();
	}
	
	//Generate Unique ID with first number the year
	private void setID(){
		this.id = Integer.toString(this.grade) + Integer.toString(this.nextId);
		this.nextId++;
	}
	
	//Enroll in courses: Add 600 to balance for enroll
	public void enrollInCourse(){
		String coursesAdded = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Which courses would you like to enroll " + 
						this.firstName + " " + this.lastName + " in?\n"
						+ "Available courses are:\n\tHistory 101\n\tMathematics 101"
						+ "\n\tEnglish 101\n\tChemistry 101\n\tComputer Science 101\n"
						+ "Please provide list separated by commas. (i.e. History 101, Mathematics 101");
		coursesAdded = in.nextLine();
		String[] courseList = coursesAdded.split(",");
		//loop
		for(int i = 0; i < courseList.length; i++){
			String course = courseList[i].trim().toLowerCase();
			switch(course){
			case "history 101": courses.add("History 101");
								System.out.println(this.firstName + " was enrolled successfully in History 101");
								balance += courseCost;
								break;
			case "mathematics 101": courses.add("Mathematics 101");
								System.out.println(this.firstName + " was enrolled successfully in Mathematics 101");
								balance += courseCost;
								break;
			case "english 101": courses.add("English 101");
								System.out.println(this.firstName + " was enrolled successfully in English 101");
								balance += courseCost;
								break;
			case "chemistry 101": courses.add("Chemistry 101");
								System.out.println(this.firstName + " was enrolled successfully in Chemistry 101");
								balance += courseCost;
								break;
			case "computer science 101": courses.add("Computer Science 101");
								System.out.println(this.firstName + " was enrolled successfully in Computer Science 101");
								balance += courseCost;
								break;
			default: System.out.println(course.substring(0,1).toUpperCase() + course.substring(1) + " is not a valid class, so " + this.firstName + " will not be enrolled.");
								break;
			}
			
		}
		System.out.println(this.firstName + "'s new balance is " + balance);
	}
	
	//Pay tuition: Subtract payments from balance
	public void payTuition() {
		Scanner in = new Scanner(System.in);
		System.out.println("How much of the tuition would you like to pay for " + 
						this.firstName + " " + this.lastName + "?");
		int tuitionPaid = Integer.parseInt(in.nextLine());
		this.balance -= tuitionPaid;
		System.out.println("$" + tuitionPaid + " of " + this.firstName + " " + this.lastName + "'s tuition has been paid.\n"
				+ "The remaining balance is $" + this.balance);
	}
	
	//Show status
	public void checkStatus() {
		String courseList = "";
		for(int i = 0; i < courses.size(); i++){
			if(i == courses.size()-1)
				courseList += courses.get(i);
			else
				courseList += courses.get(i) + ", ";
		}
		if(courseList.isEmpty())courseList = "None";
		System.out.println("\nStatus:\nName:\t\t" + this.lastName + ", " 
				+ this.firstName + "\nID:\t\t" + this.id + "\n"
				+ "Grade:\t\t" + this.grade + "\nCourses:\t" + courseList
				+ "\nBalance:\t$" + this.balance);
	}
	
	//Get balance
	public int getBalance(){
		return this.balance;
	}
	
	//Get get name
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getFullName(){
		return this.lastName + ", " +this.firstName;
	}
	
	//Get ID
	public String getID(){
		return id;
	}

	public void checkBalance() {
		System.out.println(this.firstName + " " + this.lastName + "'s current balance is $" + this.balance);
	}

	//Get courses
	
}
