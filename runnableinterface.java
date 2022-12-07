package mypack1;
class testing implements Runnable{
	public void run()
	{
		int i=1;
		while(i<100) {
			System.out.println(i+"Hello");
			i++;
		}
	}
}


public class runnableinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testing t1=new testing();
		Thread t=new Thread(t1);
		t.start();
		int i=1;
		while(i<100) {
			System.out.println(i+"worldddddd");
			i++;
		}
	


	}

}
