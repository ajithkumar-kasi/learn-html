import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int r,rev=0;		
		System.out.println("Enter the numbers:");
		int n=sc.nextInt();
		int i=n;
		while(n>0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(i==rev) {
		
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		}
	}

