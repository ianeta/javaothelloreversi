package org.open.game.othello;

public class InvalidMoveException extends InvalidCommandException {
	private Position pos;

	public InvalidMoveException(Position pos) {
		this.pos = pos;
	}

	private static final long serialVersionUID = 1L;

	public Position getPosition() {
		return pos;
	}

}
