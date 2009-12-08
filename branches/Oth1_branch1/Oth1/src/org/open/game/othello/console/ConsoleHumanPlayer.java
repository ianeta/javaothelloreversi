package org.open.game.othello.console;

import java.util.Scanner;

import org.open.game.othello.Piece;
import org.open.game.othello.Player;
import org.open.game.othello.Position;

public class ConsoleHumanPlayer extends Player {
	private Scanner scanner = new Scanner(System.in);

	public ConsoleHumanPlayer(Piece piece) {
		super(piece);
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

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;		
	}
}
