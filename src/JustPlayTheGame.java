
public class JustPlayTheGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Start.open();
		
		while (true) {
			Actions.playGame();
			Actions.isNewRecord();
			Actions.newGame();
		}	
		
	}

}
