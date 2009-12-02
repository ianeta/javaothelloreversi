package org.open.game.othello.console;

import org.open.game.othello.Board;
import org.open.game.othello.OthelloView;
import org.open.game.othello.Piece;
import org.open.game.othello.Player;

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
