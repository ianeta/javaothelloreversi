package org.nothize.game.othello.console.unittest;

import org.junit.Test;
import org.nothize.game.othello.Board;
import org.nothize.game.othello.OthelloState;
import org.nothize.game.othello.console.ConsoleAdapter;
import org.nothize.game.othello.console.ConsoleView;

public class ConsoleViewTest {
	
	@Test
	public void testRender() {
		Board b = new Board();
		
		ConsoleAdapter adapter = new ConsoleAdapter();
		adapter.setState(new OthelloState());
		adapter.render();
	}

}
