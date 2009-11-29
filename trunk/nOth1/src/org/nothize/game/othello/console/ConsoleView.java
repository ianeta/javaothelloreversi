package org.nothize.game.othello.console;

import org.nothize.game.othello.Board;
import org.nothize.game.othello.OthelloView;
import org.nothize.game.othello.Piece;
import org.nothize.game.othello.Player;

public class ConsoleView implements OthelloView {
	Player player;
	
	public void render(Board b) {
		Piece[][] p = b.getPieces();
		
		System.out.print(" ");
		for (int i = 0; i < p.length; i++) {
			System.out.print(" " + (i+1));
		}
		System.out.println();
		for (int i = 0; i < p.length; i++) {
			System.out.print((i+1));
			for (int j = 0; j < p[i].length; j++) {
				System.out.printf("%2c", p[i][j].getFace());
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Current player: " + player);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
