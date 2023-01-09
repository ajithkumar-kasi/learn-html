package mypack1;
import java.util.Scanner;

public class createidentitymat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Printing Identity Matrix:");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j) {
					System.out.print(1+" ");
				}
			   else {
					System.out.print(0+" ");
			   }
				
					
					}
			System.out.println(" ");
			
	}

	}}
