package org.nothize.game.othello.console;

import java.util.Scanner;

import org.nothize.game.othello.OthelloAdapter;
import org.nothize.game.othello.OthelloState;
import org.nothize.game.othello.Position;

public class ConsoleAdapter implements OthelloAdapter {
	private ConsoleView view;
	private OthelloState state;
	private Scanner scanner = new Scanner(System.in);

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
	
	private int nextInt(String s) {
		do {
			System.out.println(s);
		} while ( !scanner.hasNextInt() && null != scanner.next() );
		return scanner.nextInt();
	}

	public Position getMove() {
		int x = nextInt("Please input position x: ");
		int y = nextInt("Please input position y: ");
		
		return new Position(x, y);
	}
}
