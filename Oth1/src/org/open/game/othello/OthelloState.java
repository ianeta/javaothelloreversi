package org.open.game.othello;

import java.util.Date;

public class OthelloState {
	Board board;
	Player currentPlayer;
	long gameBegin;
	long turnBegin;

	public OthelloState() {
		init();
	}
	
	public void init() {
		board = new Board();
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
}
