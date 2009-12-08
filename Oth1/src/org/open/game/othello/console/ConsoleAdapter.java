package org.open.game.othello.console;

import org.open.game.othello.OthelloAdapter;
import org.open.game.othello.OthelloState;

public class ConsoleAdapter implements OthelloAdapter {
	private ConsoleView view;
	private OthelloState state;

	public ConsoleAdapter() {
		this.view = new ConsoleView();
	}
	
	public void render() {
		view.setPlayer(state.getCurrentPlayer());
		view.render(state.getBoard());
	}

	public OthelloState getState() {
		return state;
	}

	public void setState(OthelloState state) {
		this.state = state;
	}
}
