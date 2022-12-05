class test{
	public void display() {
		System.out.println("Hello");
	}
}
class test1 extends test{
	public void display() {
		System.out.println("Hello ajith!");
	}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t=new test();
		test1 t1=new test1();
		t.display();
		t1.display();
	}

}
