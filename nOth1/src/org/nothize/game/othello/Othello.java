package org.nothize.game.othello;

/**
 * This is the main class of the game. A game loop will continue
 * to run until {@link OthelloGame#isTerminate()} return true.
 * 
 * @author nothize
 *
 */
public class Othello {
	public static void main(String[] args) {
		OthelloGame og = new OthelloGame(new ConsoleAdapter());
		
		while ( !og.isTerminate() ) {
			
			 /*The turn may timeout if it took too long. Therefore,
			 prepare to catch an InterruptedException.*/
			try {
				
				/*Proceed one turn.*/
				og.tick();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
