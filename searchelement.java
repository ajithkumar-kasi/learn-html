import java.util.Scanner;
public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int A[]= {8,1,22,2,6,96,4,1,63,7,2,43};
		System.out.println("Enter the value");
		int key=sc.nextInt();
		
		
		for(int i=0;i<A.length;i++)
		{
			if(key==A[i]) {
				
				System.out.println("The value is in the array:"+i);
				System.exit(0);
			}
		}
			
			System.out.println("Not found");
		}
		
	}


