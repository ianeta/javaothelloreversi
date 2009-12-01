package org.open.game.othello;

public interface OthelloAdapter {
	void render();

	void setState(OthelloState state);

	Position getMove();
}
