package org.nothize.game.othello;

public interface OthelloAdapter {
	Position getCurrentMove();
	
	void render();

	void setState(OthelloState state);
}
