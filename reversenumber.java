import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,rev=0;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		
		}
		System.out.println(rev);
		

	}

}
