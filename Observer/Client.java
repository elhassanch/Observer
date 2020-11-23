package Observer;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject(0);
		BinObserver binobserver = new BinObserver(subject);
		HexObserver hexobserver = new HexObserver(subject);
		OctObserver octobserver = new OctObserver(subject);
		
		Thread thread = new Thread(subject);
		thread.start();
	}
}