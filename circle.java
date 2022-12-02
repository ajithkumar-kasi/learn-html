
import java.math.*;


public class circle {
	public int radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		circle c=new circle();
		c.radius=5;
		
		
		
		System.out.println("Area of the circle: "+ c.area());
		System.out.println("Area of the perimeter: "+ c.perimeter());
		System.out.println("Area of the circumference: "+ c.circumference());
		
		
	}

}
