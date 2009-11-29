package org.nothize.game.othello;

public class ConsoleAdapter implements OthelloAdapter {
	private ConsoleView view;
	private OthelloState state;

	public ConsoleAdapter() {
		this.view = new ConsoleView();
	}
	
	public Position getCurrentMove() {
		Position p = new Position(4, 3);
		return p;
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
