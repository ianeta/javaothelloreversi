package org.nothize.game.othello;

import java.util.Date;

public class OthelloState {
	Board board;
	Player currentPlayer;
	Player players[] = new Player[2];
	long gameBegin;
	long turnBegin;

	public OthelloState() {
		init();
	}
	
	public void init() {
		board = new Board();
		players[0] = currentPlayer = new Player(Piece.BLACK);
		players[1] = new Player(Piece.WHITE);
		turnBegin = 0;
	}
	
	public void beginGame() {
		gameBegin = new Date().getTime();
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public long getGameBegin() {
		return gameBegin;
	}

	public void setGameBegin(long gameBegin) {
		this.gameBegin = gameBegin;
	}

	public long getTurnBegin() {
		return turnBegin;
	}

	public void setTurnBegin(long turnBegin) {
		this.turnBegin = turnBegin;
	}

	public Board getBoard() {
		return board;
	}

	public Player[] getPlayers() {
		return players;
	}
}
