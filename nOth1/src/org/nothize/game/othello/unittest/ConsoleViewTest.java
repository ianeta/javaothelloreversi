package org.nothize.game.othello.unittest;

import org.junit.Test;
import org.nothize.game.othello.Board;
import org.nothize.game.othello.ConsoleAdapter;
import org.nothize.game.othello.ConsoleView;
import org.nothize.game.othello.OthelloState;

public class ConsoleViewTest {
	
	@Test
	public void testRender() {
		Board b = new Board();
		
		ConsoleAdapter adapter = new ConsoleAdapter();
		adapter.setState(new OthelloState());
		adapter.render();
	}

}
