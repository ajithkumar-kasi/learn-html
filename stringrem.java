
public class stringrem {

	public static void main(String[] args) {
	String str="ajithkumarkasi555@gmail.com";
	int a=str.indexOf("@");
	String username=str.substring(0,a);
	String domain=str.substring(a+1,str.length());
	
	System.out.println("userid: "+username);
	System.out.println("domainid :"+domain);
	
	

	}

}
