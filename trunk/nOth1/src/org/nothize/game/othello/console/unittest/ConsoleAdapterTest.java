package org.nothize.game.othello.console.unittest;

import org.junit.Test;
import org.nothize.game.othello.Position;
import org.nothize.game.othello.console.ConsoleAdapter;

public class ConsoleAdapterTest {

	@Test
	public void testGetMove() {
		ConsoleAdapter a = new ConsoleAdapter();
		Position p = a.getMove();
		System.out.println(p);
	}

}
