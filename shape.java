abstract class shapes{
	abstract public double perimeter();
	abstract public double area();
}
class circles extends shapes{
	double r;
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}
}
class rectangles extends shapes
{
	double l;
	double b;
	public double area() {
		return l*b;
	}
	public double perimeter() {
		return 2*(l+b);
	}
}
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangles r=new rectangles();
		r.b=45;
		r.l=10;
		circles c=new circles();
		c.r=15;
		System.out.println("Area of the rectangle is: "+c.area());
		
		
		shapes s=c;
		System.out.println("Area of the rectangle is: "+s.area());
	}
}