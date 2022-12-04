class parent{
	parent() {
		System.out.println("non param of parent");
	}
	parent(int x) {
		System.out.println("param of parent  "+x);
	}
}
class child extends parent{
	child() {
		System.out.println("non param of child");
	}
	child(int x,int y) {
		super (x);
		System.out.println("param of child  "+y);
	}
}
public class parentinheritence {

	public static void main(String[] args) {
		child c=new child(10,43);

	}

}
