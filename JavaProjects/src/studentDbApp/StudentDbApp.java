package studentDbApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentDbApp {

	public static void main(String[] args) {
		int numberOfStudents;
		HashMap<String,Student> students = new HashMap<String,Student>();
		String yesNo = "";
		
		//Ask how many students to add
		Scanner in = new Scanner(System.in);
		System.out.println("How many students would you like to add?");
		numberOfStudents = Integer.parseInt(in.nextLine());
		
		//Add n number of students
		for(int i = 0; i < numberOfStudents; i++){
			Student student = new Student();
			students.put(student.getID(),student);
		}
		
		//Enroll n number of students into n number of courses
		System.out.println("\nWould you like to enroll any students into courses? (Yes/No)");
		yesNo = in.nextLine();
		Boolean enroll = false;
		switch(yesNo.toLowerCase()){
		case "yes":	enroll = true;
					break;
		case "no":	enroll = false; 
					break;
		default:	System.out.println("Invalid input entered. No students will be enrolled.");
					enroll = false;
					break;
		}
		if(enroll){
			System.out.println("How many students would you like to enroll in a course?");
			numberOfStudents = Integer.parseInt(in.nextLine());
			
			//Add n number of students
			for(int i = 0; i < numberOfStudents; i++){
				System.out.println("Which student would you like to enroll in a course?\n"
						+ "Please provide the student's ID:\t");
				String studentID = in.nextLine();
				Student student = students.get(studentID);
				student.enrollInCourse();
			}
		}
		
		//Check balances for n number of students
		System.out.println("\nWould you like to check the balance for any students? (Yes/No)");
		yesNo = in.nextLine();
		Boolean balance = false;
		switch(yesNo.toLowerCase()){
		case "yes":	balance = true;
					break;
		case "no":	balance = false; 
					break;
		default:	System.out.println("Invalid input entered. No students' balances will be checked.");
					balance = false;
					break;
		}
		if(balance){
			System.out.println("How many students would you like to check the balance for?");
			numberOfStudents = Integer.parseInt(in.nextLine());
			
			//Add n number of students
			for(int i = 0; i < numberOfStudents; i++){
				System.out.println("Which student would you like to check the balance for?\n"
						+ "Please provide the student's ID:\t");
				String studentID = in.nextLine();
				Student student = students.get(studentID);
				student.checkBalance();
			}
		}
		
		//Pay tuition for n number of students
		System.out.println("\nWould you like to pay tuitions for any students? (Yes/No)");
		yesNo = in.nextLine();
		Boolean tuition = false;
		switch(yesNo.toLowerCase()){
		case "yes":	tuition = true;
					break;
		case "no":	tuition = false; 
					break;
		default:	System.out.println("Invalid input entered. No students' tuitions will be paid.");
					tuition = false;
					break;
		}
		if(tuition){
			System.out.println("How many students would you like to pay tuition for?");
			numberOfStudents = Integer.parseInt(in.nextLine());
			
			//Add n number of students
			for(int i = 0; i < numberOfStudents; i++){
				System.out.println("Which student would you like to pay tuition for?\n"
						+ "Please provide the student's ID:\t");
				String studentID = in.nextLine();
				Student student = students.get(studentID);
				student.payTuition();
			}
		}
		
		//Show status for n number of students
		System.out.println("\nWould you like to check the status for any students? (Yes/No)");
		yesNo = in.nextLine();
		Boolean status = false;
		switch(yesNo.toLowerCase()){
		case "yes":	status = true;
					break;
		case "no":	status = false; 
					break;
		default:	System.out.println("Invalid input entered. No students' statuses will be checked.");
					status = false;
					break;
		}
		if(status){
			System.out.println("How many students would you like to check the status for?");
			numberOfStudents = Integer.parseInt(in.nextLine());
			
			//Add n number of students
			for(int i = 0; i < numberOfStudents; i++){
				System.out.println("Which student would you like to check the status for?\n"
						+ "Please provide the student's ID:\t");
				String studentID = in.nextLine();
				Student student = students.get(studentID);
				student.checkStatus();
			}
		}
		
		in.close();
	}

}
