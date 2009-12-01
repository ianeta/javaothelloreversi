package org.open.game.othello.console.unittest;

import org.junit.Test;
import org.open.game.othello.Board;
import org.open.game.othello.OthelloState;
import org.open.game.othello.console.ConsoleAdapter;
import org.open.game.othello.console.ConsoleView;

public class ConsoleViewTest {
	
	@Test
	public void testRender() {
		Board b = new Board();
		
		ConsoleAdapter adapter = new ConsoleAdapter();
		adapter.setState(new OthelloState());
		adapter.render();
	}

}
