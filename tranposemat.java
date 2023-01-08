package mypack1;

public class tranposemat {

	public static void main(String[] args) {
	
		int a[][]= {
				{1,5,6},{3,5,7},{9,87,6}
		};
		int t[][]=new int[3][3];
		
		int r=a.length;
		int c=a[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				t[i][j]=a[j][i];
			}
			
		}
			
		System.out.println("Printing Original Array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+ " ");		
				}
			System.out.println(" ");
			
			}
		
		System.out.println(" ");
		
		System.out.println("Printing Transpose Array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(t[i][j]+ " ");		
				}
			System.out.println(" ");
			
			}
		}
	

}
