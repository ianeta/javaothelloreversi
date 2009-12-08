package org.open.game.othello;

public class MoveCommand implements ICommand {
	Board b;
	Piece p;
	Position pos;
	
	public MoveCommand(Board board, Piece piece, Position position) {
		this.b = board;
		this.p = piece;
		this.pos = position;
	}

	public void execute() throws InvalidCommandException {
		if ( b.isValidMove(p, pos) ) {
			b.setPiece(pos, p);
		} else {
			throw new InvalidMoveException(pos);
		}
	}
}
