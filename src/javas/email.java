package javas;

import java.util.Scanner;

public class email {
	private String firstname;
	private String lastname;
	private String password;
	private String departmant;
	private String email;
	private int mailboxCapcatiy;
	private int defaultPasswordLength = 10;
	private String altarnateEmail;
	private String companySuffix = "company.com"; 

	public email(String firstname, String lastname) { 
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.departmant = setDepartment();
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is  : " +  this.password);
		
		email  = lastname.toLowerCase() + "." + lastname.toLowerCase() + "@" + departmant + "." + companySuffix;
	
	
	}
	
	
	private String setDepartment() {
		System.out.println("New Worker:" +  firstname + ". DEPARTMENT CODES \n1 for sales \n2 for Development\n3 for Acount \n0 for none\n Enter depertment code :");
		Scanner in = new Scanner(System.in);
		 int depChoice = in.nextInt();
		 if(depChoice == 1 ) {
			 return "Sales";
		 }else if (depChoice == 2) {
			 return "Dev";
		 }else if(depChoice == 3) {
			 return "acct";
		 }else {
			 return "";
		 }
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLUMNOPQRS9U809YU?)*";
		char [] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
							  
			}
			return new String(password);
		}	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapcatiy =  capacity;
	}	
	
	public void setAltarnativeemail(String altEmail) {
		this.altarnateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapcatiy() {return mailboxCapcatiy; }
	public String getAltarnatveEmail() {return altarnateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME : " + firstname + " " + lastname +
					"\nCOMPANY EMAIL : " + email + 
					"\nMAILBOX CAPICATIY : " + mailboxCapcatiy  + "ab";
	}
	
}
