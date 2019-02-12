package Feb1st;

public class Wiring {
	
	public static void main(String[] args) {
		
		ISwitchBoard switchBoard = new LGAppliances();
				//new HavellsAppliances();///wiring
		
		switchBoard.switchAC();
		switchBoard.switchFan();
		switchBoard.switchLight();
		switchBoard.switchTV();
		
	}

}
