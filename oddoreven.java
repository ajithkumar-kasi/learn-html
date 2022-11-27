import java.util.Scanner;
public class oddoreven {

	public static void main(String[] args) {
		int n;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("the number is even");	
		}
		else {
			System.out.println("the number is odd");
		}

	}

}
