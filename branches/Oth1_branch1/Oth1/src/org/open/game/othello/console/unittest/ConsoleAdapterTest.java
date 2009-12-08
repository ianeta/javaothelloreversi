package org.open.game.othello.console.unittest;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.open.game.othello.OthelloState;
import org.open.game.othello.Piece;
import org.open.game.othello.Position;
import org.open.game.othello.console.ConsoleAdapter;

public class ConsoleAdapterTest {
	ConsoleAdapter a;
	OthelloState s;
	
	@Before
	public void before() {
		a = new ConsoleAdapter();
		s = new OthelloState();
		a.setState(s);
	}
	
	@Test
	public void testGetMove() {
		// Check for valid input
		a.setScanner(new Scanner("3 4"));
		Position p = a.getMove();
		Assert.assertEquals(p, new Position(3, 4));
		// Check for invalid input before valid one
		a.setScanner(new Scanner("aab sdf 2 1"));
		p = a.getMove();
		Assert.assertEquals(p, new Position(2, 1));
		a.setScanner(new Scanner("aab sdf 2.2 3 1"));
		p = a.getMove();
		Assert.assertEquals(p, new Position(3, 1));
	}
	
	@Test
	public void testMove() throws Exception {
		Position p = new Position(3, 4);
	}
}
