package threads;

public class PrinterThread extends Thread {
	
	@Override
	public void run() {
		super.run();
		System.out.println("printing on a paper");
	}
}
