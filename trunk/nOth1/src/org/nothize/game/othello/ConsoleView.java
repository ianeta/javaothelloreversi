package org.nothize.game.othello;

public class ConsoleView implements OthelloView {
	/* (non-Javadoc)
	 * @see org.nothize.game.othello.OthelloView#render(org.nothize.game.othello.Board)
	 */
	public void render(Board board) {
		Piece[][] p = board.getPieces();
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.printf("%c", p[i][j].getFace());
			}
		}
	}
}
