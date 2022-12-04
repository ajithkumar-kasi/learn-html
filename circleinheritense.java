class circle10{
	public double r;
	
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}
	public double circumference() {
		return perimeter();
	}
}

class cylinder10 extends circle10
{
	public double h;
	
	public double volume() {
		return area()*h;
	}
}
public class circleinheritense {

	public static void main(String[] args) {

		
		cylinder10 c=new cylinder10();
		c.r=20;
		c.h=5;
		System.out.println("Area  : "+c.area());
		System.out.println("volume: "+c .volume());

		
	}

}
