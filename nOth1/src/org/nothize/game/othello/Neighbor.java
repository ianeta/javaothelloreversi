package org.nothize.game.othello;

public enum Neighbor {
	UL(-1,-1),
	U(0,-1),
	UR(1,-1),
	
	L(-1,0),
	R(1,0),
	
	BL(-1,1),
	B(0,1),
	BR(1,1);
	
	int x = 0;
	int y = 0;
	
	Neighbor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
	
