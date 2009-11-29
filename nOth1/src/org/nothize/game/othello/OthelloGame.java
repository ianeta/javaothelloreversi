package org.nothize.game.othello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OthelloGame {
	OthelloState state = new OthelloState();
	OthelloAdapter adapter;
	private boolean terminate = false;
	
	public OthelloGame(OthelloAdapter adapter) {
		this.adapter = adapter;
		adapter.setState(state);
	}
	
	/**
	 * One game tick. For Othello, this is a turn.
	 * 
	 * This method could have a timeout to force an action to
	 * be taken or declaring the current player as loser.
	 * 
	 * @throws InterruptedException
	 */
	public void tick() throws InterruptedException {
		updateUI();
		
		Position p = adapter.getCurrentMove();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateUI() {
		adapter.render();
	}

	/**
	 * If the player chose to quit or when the end game condition
	 * is met, it will be called to signal a termination request.
	 * 
	 * @return
	 */
	public void setTerminate(boolean terminate) {
		this.terminate = terminate;
	}

	/**
	 * Return the termination flag.
	 * 
	 * @return true if the game is going to terminate.
	 */
	public boolean isTerminate() {
		return terminate;
	}
}
