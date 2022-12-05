interface test10{
	public void meth1();
	public void meth2();
}
class test11 implements test10{
	public void meth1() {
		System.out.println("Meth1 of class test1");
	}
	public void meth2() {
		System.out.println("Meth2 of class test1");
	}
	public void meth3() {
		System.out.println("Meth3 of class test1");
	}
}
public class interfacepractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test10 t=new test11();
		t.meth1();
		t.meth2();
	}

}
