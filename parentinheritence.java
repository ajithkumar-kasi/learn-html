class parent{
	parent() {
		System.out.println("non param of parent");
	}
	parent(int x) {
		System.out.println("param of parent");
	}
}
class child extends parent{
	child() {
		System.out.println("non param of child");
	}
	child(int x) {
		super (x);
		System.out.println("param of child");
	}
}
public class parentinheritence {

	public static void main(String[] args) {
		child c=new child(10);

	}

}
