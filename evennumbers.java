package mypack1;

import java.util.Scanner;

public class evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number:");  
		s=sc.nextInt();
		System.out.println("Enter the ending number:");  
		e=sc.nextInt();
		
		for(int i=s;i<=e;i++) {
			if(i%2==0)
				System.out.println(i+" ");
		}
		
	}

}
