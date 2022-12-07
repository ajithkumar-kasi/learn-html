package mypack1;

/*class mythread extends Thread{
	public void run()
	{
		int i=1;
		while(i<100) {
			System.out.println(i+"Hello");
			i++;
		}
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mythread t=new mythread();
		t.start();
		int i=1;
		while(i<100) {
			System.out.println(i+"world");
			i++;
		}
	}

}*/




public class test extends Thread{
	public void run()
	{
		int i=1;
		while(i<100) {
			System.out.println(i+"Hello");
			i++;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t=new test();
		t.start();
		int i=1;
		while(i<100) {
			System.out.println(i+"worldddddddddddd");
			i++;
		}
	}

}




