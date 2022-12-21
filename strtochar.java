package mypack1;

public class strtochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Ajith";
		/*
		char c=s.charAt(0);
		System.out.println("1st Character:"+c);*/
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			System.out.println("char at"+" "+i+" index is"+" "+c);
		}
	}

}
