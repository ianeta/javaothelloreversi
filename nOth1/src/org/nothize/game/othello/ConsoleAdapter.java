package org.nothize.game.othello;

public class ConsoleAdapter implements OthelloAdapter {
	public Position getCurrentMove() {
		Position p = new Position(4, 3);
		return p;
	}
}
