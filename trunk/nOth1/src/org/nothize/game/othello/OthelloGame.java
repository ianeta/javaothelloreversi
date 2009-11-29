package org.nothize.game.othello;

public class OthelloGame {
	OthelloState state = new OthelloState();
	OthelloView view;
	OthelloAdapter adapter;
	private boolean terminate = false;
	
	public OthelloGame(OthelloView view, OthelloAdapter adapter) {
		this.view = view;
		this.adapter = adapter;
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
	}
	
	public void updateUI() {
		view.render(state.getBoard());
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
