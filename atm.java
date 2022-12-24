package mypack1;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balance=500,withdraw,deposit;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("***ATM Machine Menu***");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			System.out.println("4.exit");
			System.out.println("choose the option to proceed");
			
			
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the money to be withdraw");
				withdraw=sc.nextInt();
				balance=balance-withdraw;
				System.out.println("Money withdraw is completed");
				break;
			case 2:
				System.out.println("enter the money to be deposited");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("Money is deposited");
				break;
			case 3:
				System.out.println("The total balance is:  "+balance);
				break;
			case 4:
				System.exit(4);
				
			}
		}
	}

}
