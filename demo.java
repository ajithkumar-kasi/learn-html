import java.util.Scanner;
public class demo {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name= scanner.nextLine();
		System.out.println("hello"+name);
		
		System.out.println("enter yur age");
		Integer age= scanner.nextInt();
		System.out.println("your age is " + age + " right");
		scanner.nextLine();
		
		System.out.println("enter the email");
		String email= scanner.nextLine();
		System.out.println("your email"+email);
		
		System.out.println("enter float value");
		Float pi= scanner.nextFloat();
		System.out.println("pi value is"+ pi);
		
		}
}
