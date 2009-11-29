package org.nothize.game.othello;

public class ConsoleView {
	public void drawBoard(Board board) {
		Piece[][] p = board.getPieces();
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.printf("%c", p[i][j].getFace());
			}
		}
	}
}
