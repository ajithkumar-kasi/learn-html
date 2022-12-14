package mypack1;

public class addevenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,67,9,10,6};
		System.out.println("The Original Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		/*System.out.println("The odd positions of Array: ");
		for(int i=0;i<a.length;i=i+2)
		{	
				System.out.print(a[i]+" ");	
			
		}*/
		
		System.out.println("The even positions of Array: ");
		for(int i=1;i<a.length;i=i+2)
		{	
				System.out.print(a[i]+" ");	
			
		}
		
		
		
	}

}
