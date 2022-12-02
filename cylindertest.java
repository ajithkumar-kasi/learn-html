class cylinder{
	public double r;
	public double h;
	
	public double area() {
		return Math.PI*r*r;
	}
	public double totalsurfacearea()
	{
		return 2*area()+2*circumference()*h;
	}
	public double circumference() {
		return 2*Math.PI*r;
	}
	public double volume() {
		return area()*h;
	}
}
public class cylindertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder c=new cylinder();
		c.r=24;
		c.h=5;
		System.out.println("Area of the cylinder:"+c.area());

		System.out.println("totalsurfacearea of the cylinder:"+c.totalsurfacearea());
		System.out.println("circumference of the cylinder:"+c.circumference());
		System.out.println("volume of the cylinder:"+c.volume());
	}

}
