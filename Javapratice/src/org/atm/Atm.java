

	package org.atm;

	import java.util.Scanner;
	public class Atm {
		public static void main(String[] args){
		//creating section 
		int pin=1234;
		int balance =1000;
		int addmoney=0;
		int withralmoney=0 ;
		
		String name;
		Scanner scanner= new Scanner(System.in);
		System.out.println("!!!...***Welcome to Our ATM...***!!!");
		//enter your pin
		System.out.println("Enter Your Pin");
		int password = scanner.nextInt();
		//if 
		if (password==pin) {
			System.out.println("Enter your name");
			name=scanner.next();
			System.out.println("welcome"+name);
			while(true) {
				System.out.println("press 1 to check your balance  ");
				System.out.println("press 2 to add money");
				System.out.println("Press 3 to withral money");
				System.out.println("Press 4 to take recipt");
				System.out.println("Press 5 to exit");
	int opt =scanner.nextInt();
	switch (opt) {
	case 1:
		System.out.println("current balance is "+ balance );

		break;
	case 2:
		
		System.out.println("add your money ");
	 addmoney=scanner.nextInt();
		
	 System.out.println("money added succes fully");
		balance=addmoney+balance;

		System.out.println("your balance is "+balance);
		break;
	case 3:
			System.out.println();
		withralmoney=scanner.nextInt();
		if (withralmoney>balance) {
			System.out.println("your balance in less");
		}
		else {		System.out.println("successfuly depited");
	balance =balance-withralmoney;

	}
	break;
	case 4:
	{		System.out.println("welcome to bank");
	System.out.println("available balance is "+balance);
	System.out.println("amount deposied"+addmoney);
	System.out.println("withral monrey"+withralmoney);
	System.out.println("ThankYou");
	break;}
	case 5:{
	if (opt ==5) {

		System.out.println("Thankyou");
		break;
	}}
	default:{
		
		System.out.println("press 5");
		break;
	}	


		
	}
			}}

	else {
		System.out.println("woring pin ");
		System.out.println("Please Enter Valid Pass Word ");
			
				
			}
		}
	}
		
	
		
		
		
		
		
		
		
		
		
		









