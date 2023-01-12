package mypack1;

public class deleteduplicatenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,2,6,3,84,1};
		System.out.println("original array");
		for(int i:a)
			System.out.print(i+" ");
	
		System.out.println(" ");
		System.out.println("after the deletion");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					 System.out.print(a[i]+" "); 
				}
			}
		}
		
		
		
	}

}
