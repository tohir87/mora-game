import java.util.Scanner;

public class MoraApp {

	public static void main(String[] args) {
		
		
		Scanner input;
		input = new Scanner(System.in);

		int roundWon = 0;
		int playRound = 0;
		
		// Instantiate mora class
		Mora obj = new Mora();
		
		while(true) {
			
			
			int gameRound = 0;
			
			boolean gameState = true;
			
			// select player type. evens or odds 
			boolean isOkay = obj.selectPlayerType();
			if (!isOkay) {
				obj.selectPlayerType();
			}
			
			while (gameState){
				
				// accept input from player
				obj.playGame(gameRound);
				
				gameState = obj.checkGameState();
				++gameRound;
			}
			
			// display winner
			obj.determineWinner(playRound);
			
			// print finger history
			obj.displayFingerHistory();
			
			
			System.out.println("\n Do you want to play another game (Y,n)");
			char playAgain = input.next().charAt(0);
			
			if (playAgain == 'n') {
				//System.out.println("Thanks for playing Mora game.");
				
				// display game history
				obj.displayGameHistory();
				// display even/odd number count for each player
				return;
			}
			
			++playRound;
			
		}

	}
	
	

}
