package mypack1;
import java.util.Scanner;

class details{
	public void meth1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String s=sc.nextLine();
		String Name=s;
		System.out.println("The Entered name is stored");
		
	}
}
public class like {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		details d=new details();
		d.meth1();
		
		
	}

}
