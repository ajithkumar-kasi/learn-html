package mypack1;
import java.util.Scanner;  
public class perfectsquareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");   
		double number=sc.nextDouble();   
		if (checkPerfectSquare(number))   
		System.out.println("Yes, the given number is perfect square.");  
		else  
		System.out.print("No, the given number is not perfect square.");   
		}  
		static boolean checkPerfectSquare(double number)   
		{   
		for (int i=1; i*i<=number; i++)   
		{   
		if((number%i==0) && (number/i==i))   
		{   
		return true;   
		}   
		}   
		return false;   
		   
		  
	}

}
