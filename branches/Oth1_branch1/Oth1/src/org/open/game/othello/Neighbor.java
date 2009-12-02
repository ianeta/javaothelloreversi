package org.open.game.othello;

import java.util.Arrays;
import java.util.List;

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
	
	public static List<Neighbor> r1 = Arrays.asList(new Neighbor[] { UL, U, UR });
	public static List<Neighbor> r3 = Arrays.asList(new Neighbor[] { BL, B, BR });
	public static List<Neighbor> c1 = Arrays.asList(new Neighbor[] { UL, L, BL });
	public static List<Neighbor> c3 = Arrays.asList(new Neighbor[] { UR, R, BR });
}
	
