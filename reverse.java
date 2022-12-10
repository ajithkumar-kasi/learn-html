package mypack1;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str= "Geeks", nstr="";
	        	        
	      System.out.print("Original word: ");
	      System.out.println("Geeks"); //Example word
	        
	      for (int i=str.length()-1;i>=0;i--)
	      {
	         nstr=nstr+str.charAt(i);
	      }
	      System.out.println("Reversed word: "+ nstr);
	}

}
