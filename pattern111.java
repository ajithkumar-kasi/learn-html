package mypack1;

public class pattern111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=5;j>0;j--) {
				if(j!=i) {
					System.out.print(j);
				}
				else {
					
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}
	}

}
