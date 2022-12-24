package mypack1;
import java.util.Scanner;
public class spynumber {

	public static void main(String[] args) {
		int n,sum=0,product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mumber");
		n=sc.nextInt();
	
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
		}
		if(sum==product) {

			System.out.println("The number is Spy number");
		}

		else {

			System.out.println("The number is NOT Spy number");
		}
	
		
		
	}

}
