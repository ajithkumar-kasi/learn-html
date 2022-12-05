class tv{
	public void switchON() {
		System.out.println("TV is switched on");
	}
	public void changeChannel() {
		System.out.println("TV Channel is changed");
	}
}
class smarttv extends tv{
	@Override
	public void switchON() {
		System.out.println("smart TV is switched on");
	}
	@Override
	public void changeChannel() {
		System.out.println("smart TV Channel is changed");
	}
	public void browse() {
		System.out.println("smart TV is browsing");
	}
	
}
public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*tv t=new tv();
		t.changeChannel();
		t.switchON();
		*/
		
		/*smarttv t1=new smarttv();
		t1.browse();
		t1.switchON();*/
		
		tv t=new smarttv();
		t.changeChannel();
		t.switchON();
		
	}

}
