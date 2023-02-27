
public class sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=457;
		int r, sum=0;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+r;
			
			
		}
		System.out.println(sum);
			}

}
