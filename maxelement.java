import java.util.Scanner;
public class maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int A[]= {8,1,22,2,6,96,4,1,63,7,2,43};	
		int max1,max2;
		max1=max2=A[0];
		
		for(int i=0;i<A.length;i++)
		{
		
			if(A[i]>max1) {
				max2=max1;
				max1=A[i];
				}
			else if(A[i]>max2) {
				max2=A[i];
			}
		}
		System.out.println("The Maximum Element is"+max2);
	}

}
