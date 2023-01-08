package mypack1;

public class ecahrowandcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {
				{12,24,36},
				{42,15,65},
				{75,89,69}			
		};
		
		int r=a.length;
		int c=a[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("The row "+ i +" and the column " +j+" is: "+a[i][j]);
				
			
			}
		}
		
	}

}
