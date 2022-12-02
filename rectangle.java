class rectangle1 {
	public int width;
	public int length;
	
	
	public int area(){
		return length*width;
	}
	public int perimeter()
	{
		return 2*(length+width);
	}
	
}
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle1 ra=new rectangle1();
		ra.length=15;
		ra.width=20;
		
		System.out.println("the area of the rectangle is: "+ra.area());
		System.out.println("the perimeter of the rectangle is: "+ra.perimeter());
	}

}
