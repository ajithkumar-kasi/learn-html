
public class swapbitwise {

	public static void main(String[] args) {
		int a=24,b=45;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("the value of a and b are: "+a+"and"+b);
	}

}
