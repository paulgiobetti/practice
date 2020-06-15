package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName, lastName, email, department, company, password, altEmail = "";
	private int mailboxCapacity = 500;
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call method to ask for department
		this.department = setDepartment();
		System.out.println("Department set to: " + this.department);
		
		this.company = "example";
		
		//Concatenate email address
		if(this.department.isEmpty())
			this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.company.toLowerCase() + ".com";
		else
			this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.company.toLowerCase() + ".com";
		System.out.println("Email Created: " + this.email);
		
		//Call method to generate password
		this.password = randomPassword();
		System.out.println("Randomly Generated Password: " + this.password);
	}
	
	//Ask for department
	private String setDepartment(){
		System.out.print("Enter Department\n\t1 - Sales\n\t2 - Development\n\t3 - Accounting\n\t4 - None\n");
		Scanner deptIn = new Scanner(System.in);
		Integer deptChoice = deptIn.nextInt();
		String deptName = "";
		switch(deptChoice){
			case 1: deptName = "Sales";
					break;
			case 2: deptName = "Development";
					break;
			case 3: deptName = "Accounting";
					break;
			case 4: deptName = "";
					break;
			default: System.out.println("Invalid department option selected. Selected \"None\" as default.");
					break;
		}
		return deptName;
	}
	
	//Generate password
	private String randomPassword(){
		System.out.println("Enter desired password length");
		Scanner passLenIn = new Scanner(System.in);
		Integer passLen = passLenIn.nextInt();
		String randPass = "";
		String passCharList = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*,.?";
		for(int i = 0; i < passLen; i++){
			int randIndx = (int)(Math.random()*passCharList.length());
			randPass += passCharList.charAt(randIndx);
		}
		
		return randPass;
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//Set password
	public void setPassword(String password){
		this.password = password;
	}
	
	//Set alternate email
	public void setAltEmail(String email){
		this.altEmail = email;
	}
	
	//Get name
	public String getName(){
		String fullName = this.firstName + " " + this.lastName;
		return fullName;
	}
	
	//Get company email
	public String getCompanyEmail(){
		return this.email;
	}
	
	//Get alternate email
	public String getAltEmail(){
		return this.altEmail;
	}
	
	//Get mailbox capacity
	public int getMailboxCapacity(){
		return this.mailboxCapacity;
	}
	
	public String displayInfo(){
		String allInfo = "";
		
		if(!getName().isEmpty())
			allInfo += "Employee Name: " + getName() + "\n";
		
		if(!getCompanyEmail().isEmpty())
			allInfo += "Company Email: " + getCompanyEmail() + "\n"
					+ "Company Email Capacity: " + getMailboxCapacity() + "\n";
				
		if(!getAltEmail().isEmpty())
			allInfo += "Alternate Email: " + getAltEmail() + "\n";
		
		return allInfo;
	}
}
