package mypack1;

public class identitymatr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=true;
		int a[][]= {
				{1,0,1},
				{0,1,0},
				{0,0,1}
		};
		int r=a.length;
		int c=a[0].length;
		
		if(r!=c) {
			System.out.println("The given matrix is not square matrix");
		}
		else {
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					
					if(i==j && a[i][j]!=1) {
						flag=false;
						break;
					}
					if(i!=j && a[i][j]!=0) {
						flag=false;
						break;
					}
				}
			}
		
			if(flag) {
				System.out.println("The given matrix is identity matrix");
			}
			else {
				System.out.println("The given matrix is not an identity matrix");
			}
		}
		
		
		
	}

}
