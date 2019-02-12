package threads;

public class NOCProcess {
	
	public static void main(String[] args) {
		PrinterThread printerThread = new PrinterThread();
		printerThread.start(); // it will inform the threadscheduler that 
							   // the printer thread is ready for execution 
		                       // with all its documents
		NetThread netThread = new NetThread();
		Thread thread = new Thread(netThread);
		thread.start();
	}
}
