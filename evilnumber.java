package mypack1;
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  

public class evilnumber {

	  
	  public static boolean checkNumber(int n) {  
	  
	  long Number = convertToBinary(n);  
	  int count = 0;  
	  while(Number != 0) {
		  if(Number % 10 == 1)   
	      count++;  
	      Number = Number / 10; 
	  }
	  
	  if(count % 2 == 0)
		  return true;   
	  else
	      return false;  
	 }  
	  
	    //create convertToBinary() method to convert the decimal value into binary  
	    private static long convertToBinary(int numberrr) {  
	        long Number = 0;  
	        int rem = 0;  
	        int j = 1;  
	        while(numberrr != 0) {  
	            rem = numberrr % 2;  
	            Number =Number + rem * j;  
	            numberrr = numberrr / 2;  
	            j = j * 10;  
	        }  
	          
	        return Number;     
	    }  
	      
	  
	    public static void main(String[] args) {  
	      
	         
	  
	          
	        Scanner sc =  new Scanner(System.in);  
	          
	        System.out.print("Enter a number : ");  
	          
	        int num = sc.nextInt();  
	  
	        // check whether the number is evil number or not  
	        if(checkNumber(num))  
	            System.out.println(num + " is an evil number");  
	        else  
	            System.out.println(num + " is not an evil number");  
	  
	    }  
	}  


