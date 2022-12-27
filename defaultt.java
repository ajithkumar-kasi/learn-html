package mypack1;

public class defaultt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leftshift
		int a[]= {1,2,3,4,6,7,8}; 
		System.out.println("original array");
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
		System.out.println("left shift ");
		for(int i:a)
			System.out.print(i+" ");

		System.out.println(" ");
		System.out.println("**************************** ");
		
		
		
		
		
		
		
		
		
		//rightshift
		int b[]= {1,2,3,4,6,7,8}; 
		System.out.println("original array");
		for(int i:b)
			
		System.out.print(i+" ");
		
		
		
		for (int j=0;j<n;j++) {
			int temp=b[b.length-1];
			for(int i=b.length-1;i>0;i--) {
				b[i]=b[i-1];
			}
				b[0]=temp;
		}
		
		System.out.println(" ");
		System.out.println("right shift ");
		for(int i:b)
			System.out.print(i+" ");
		
		System.out.println(" ");
		System.out.println(" ******************************");
		
		
		
		
		
		
		
		//reverse
		
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("original array");
		for(int i:c)
			
		System.out.print(i+" ");
		System.out.println(" ");
		System.out.println("revrese array");
		
		
		
			for(int i=c.length-1;i>=0;i--) {
				System.out.print(c[i]+" ");
			}
			
			System.out.println(" ");
			
			System.out.println(" ******************************");
			
			
			//duplicate elements
			
			
			int dup[]= {1,2,3,4,2,6,3,84,1};
			System.out.println("original array");
			for(int i:dup)
				System.out.print(i+" ");
		
			System.out.println(" ");
			for(int i = 0;i<dup.length;i++) {
				for(int j=i+1;j<dup.length;j++) {
					if(dup[i]==dup[j])
						System.out.print(dup[j]+" ");
				}
			}
			System.out.println(" ");
			
			System.out.println(" ******************************");
			
		
			//odd position
			
			int odd[]= {1,2,3,4,2,6,3,84,1};
			System.out.println("original array");
			for(int i:odd)
				System.out.print(i+" ");
		
			System.out.println(" ");

			for(int i=0;i<odd.length-1;i=i+2) {
				System.out.print(odd[i]+" ");
			}
			System.out.println(" ");
			
			System.out.println(" ******************************");
			
			
           //even position
			
			int even[]= {1,2,3,4,2,6,3,84,1};
			System.out.println("original array");
			for(int i:even)
				System.out.print(i+" ");
		
			System.out.println(" ");

			for(int i=1;i<even.length-1;i=i+2) {
				System.out.print(even[i]+" ");
			}
			
			

			System.out.println(" ");			
			System.out.println(" ******************************");
			
			
			//largest number
			
			
			int l[]= {1,2,3,54,6,7,5,47,9};
	
			System.out.println("original array");
			for(int i:l)
				System.out.print(i+" ");
		
			System.out.println(" ");

			int temp=a[0];
			for(int i=0;i<l.length;i++) {

					if(l[i]>temp) {
						temp=l[i];
					}
				
				}
			System.out.print("the largest number: "+temp);
			
			System.out.println(" ");			
			System.out.println(" ******************************");
			
			
			
			//2ndlargest number
			int max1,max2;
			max1=max2= l[0];
			for(int i=0;i<l.length;i++) {	
						if(l[i]>max1) {
							max2=max1;
							max1=l[i];
							}
						else if(l[i]>max2) {
							max2=l[i];
						
					
				}
			}
			System.out.println("the 2nd largestnumber:"+ max2);
	
			System.out.println(" ");
			
			System.out.println(" ******************************");
			
	
			
			
			
			
				}				
			
			
			
			
	

}
