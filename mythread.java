package mypack1;
class threadclass extends Thread{
	public threadclass(String name) {
		super(name);
		
	}
}
public class mythread{

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		threadclass m=new threadclass("ajith");
		System.out.println(m.getId());
		System.out.println(m.getPriority());
		System.out.println(m.getName());
		System.out.println(m.isAlive());
		System.out.println(m.getState());
		System.out.println(m.getThreadGroup());
	}

}
