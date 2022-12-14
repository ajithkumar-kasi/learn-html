package mypack1;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int a[]= {9,7,5,3,1,2,4,6,8,10};
		System.out.println("The Original Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("The reverse Array: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}

}
