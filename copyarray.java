
public class copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {18,12,22,69,64,1,23,4};
		int b[]=new int[a.length];
	
		System.out.println("elements of arrry a[]:");
	/*	for(int i=0;i<a.length;i++) {
		    b[i]=a[i];
			System.out.print(a[i]+" "); 
			
		}
		System.out.println("");
		
		System.out.println("elements of arrry b[]:");
		for(int i=0;i<b.length;i++) 
		System.out.print(b[i]+" ");*/

		
		for(int i=a.length-1;i>0;i--) {
		    b[i]=a[a.length-i];
			System.out.print(a[i]+" "); 
			
		}
		System.out.println("");
		
		System.out.println("elements of arrry b[]:");
		for(int i=0;i<b.length;i++) 
		System.out.print(b[i]+" ");
		

	}

	}
