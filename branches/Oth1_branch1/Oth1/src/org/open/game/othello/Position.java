package org.open.game.othello;

public class Position {
	public final static Position UNDEFINED = new Position(-1, -1);
	
	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Position neighbor(Neighbor n) {
		return new Position(x+n.x, y+n.y);
	}
	
	@Override
	public String toString() {
		return x + "," + y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof Position) ) {
			return false;
		}
		Position p = (Position)obj;
		return p.getX() == getX() && p.getY() == getY();
	}
}
