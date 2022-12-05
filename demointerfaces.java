class phone{
	public void call() {
		System.out.println("phone call");
	}
	public void sms() {
		System.out.println("sms in phone");
	}
}
interface camera{
	public void click();
	public void record();
	
}
interface musicPlayer{
	public void play();
	public void pause();
	public void changemusic();
}


class smartphone  extends phone implements camera,musicPlayer{
	public void sms() {
		System.out.println("sms in smartphone");
	}
	public void call() {
		System.out.println("smartphone call");
	}
	public void click() {
		System.out.println("smartphone photo clicked");
	}
	public void record() {
		System.out.println("recording in smartphone ");
	}
	public void play() {
		System.out.println("music played in smartphone");
	}
	public void pause() {
		System.out.println("paused the music in smartphone");
	}
	public void changemusic() {
		System.out.println("music changed in smartphone");
	}
	public void videocall() {
		System.out.println("Videocalling in smartphone");
	}
}
public class demointerfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*smartphone sp=new smartphone();
		sp.call();
		sp.changemusic();
		sp.click();
		sp.pause();
		sp.play();
		sp.sms();
		sp.record();*/
		
		phone p=new smartphone();
		p.call();
		p.sms();
		
		
		System.out.println("");
		
		
		camera c=new smartphone();
		c.click();
		c.record();
	}

}
