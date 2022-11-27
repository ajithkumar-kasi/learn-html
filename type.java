import java.util.Scanner;
public class type {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url:");
		String url=sc.nextLine();
		String website=url.substring(url.lastIndexOf(".")+1,url.length());
		
		System.out.println("Website id:"+ website);
		if(website.matches("com")) {
			System.out.println("Commercial Website");
		}
		else if(website.matches("in")) {
			System.out.println("india Website");
		}
		else if(website.matches("org")) {
			System.out.println("organization Website");
		}
		else if(website.matches("uk")) {
			System.out.println("united kingdom Website");
		}
		else {
			System.out.println("Invalid Website");
		}
		
		
		String ptl=url.substring(0,url.indexOf(":"));
		
		System.out.println("Protocol name:"+ ptl);
		if(ptl.matches("http")) {
			System.out.println("Hyper text transfer protocol ");
		}
		else if(ptl.matches("ftp")) {
			System.out.println("file transfer protocol");
		}
		else {
			System.out.println("Invalid Protocol");
		}
		
	}

}
