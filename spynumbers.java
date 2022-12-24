package mypack1;
import java.util.Scanner;
public class spynumbers {

	
	private static boolean spyNumbers(int n)
	{
		int r=0,sum=0,product=1;
		while(n!=0) {
			r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
		}
		if(sum==product) 
			return true;
			return false;
	}
	


	public static void main(String[] args) {
		int l=0,u=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower number(l)");
		l=sc.nextInt();
		System.out.println("enter the upper number(u)");
		u=sc.nextInt();
		System.out.println("the spy numbers between "+l+"and"+u+"are: ");

		for(int i=l;i<=u;i++) {
			if(spyNumbers(i))
				System.out.println(i+" ");
		}
	}}
	
		

