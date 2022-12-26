package mypack1;

public class defaultt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,445,67,78}; 
		for(int i:a)
		System.out.print(i+" ");
		
		int n=2;
		
		for (int j=0;j<n;j++) {
			int temp=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
				a[a.length-1]=temp;
		}
		
			
		
		System.out.println(" ");
		for(int i:a)
			System.out.print(i+" ");

	}

}
