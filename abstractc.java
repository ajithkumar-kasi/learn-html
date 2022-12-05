abstract class super1{
	public super1(){
		System.out.println("Super constructor");
	}
	public void meth1(){
		System.out.println("method 1 of super");
	}
	abstract public void meth2();
}
class sub extends super1{
	
	public void meth2() {
		System.out.println("Meth 2 of sub");
	}
	
}
public class abstractc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super1 s=new sub();
		
		s.meth1();
		s.meth2();
		
	}

}
