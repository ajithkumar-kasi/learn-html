package mypack1;

public class thisk {
	
	    int a;
	    int b;
	     
	    // Parameterized constructor
	    thisk(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	    }
	 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    }
	 
	    public static void main(String[] args)
	    {
	    	thisk object = new thisk(10, 20);
	        object.display();
	    }
	}

