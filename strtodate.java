package mypack1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class strtodate {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String sDate1="31/12/1998";  
	    Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	}

}
