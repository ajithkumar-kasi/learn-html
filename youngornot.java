import java.util.Scanner;
public class youngornot {

	public static void main(String[] args) {
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the person's age:");
		age=sc.nextInt();
		
		if(age>=50) {
			System.out.println("the person is not young");
		}
		else {
			System.out.println("the person is young");
		}

	}

}
