import java.util.Scanner;
public class menuprogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("=====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		System.out.println("Enter the two numbers:");
		Integer a=sc.nextInt();
		Integer b=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Option:");
		String opt=sc.nextLine();
		
		switch(opt) {
		case "ADD":
			System.out.println(a+b);
			break;
		case "SUB":
			System.out.println(a-b);
			break;
		case "MUL":
			System.out.println(a*b);
			break;
		case "DIV":
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid");
			break;
			
		}
		
	}

}
