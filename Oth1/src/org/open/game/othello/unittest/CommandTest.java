package org.open.game.othello.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.open.game.othello.Board;
import org.open.game.othello.CommandDispatcher;
import org.open.game.othello.ICommand;
import org.open.game.othello.InvalidMoveException;
import org.open.game.othello.MoveCommand;
import org.open.game.othello.Piece;
import org.open.game.othello.Position;

/**
 * The parties of the game:
 * 
 * | ConsoleHumanPlayer |  | Player |	| Board |   | Game |   | CommandAdapter |       | Move command |
 *                                                 ca.getCommand()----->
 *                                                                 translate command
 *                                                                 execute command ------>
 *                               <-------------------------------------------------------Player.getMove()
 *            <------------- getMove()
 *            >-------------- Position ---------------------------------------------------> Position
 *            
 *            
 * Move command
 * 
 * 
 * Position p = Player.getMove()
 * 
 * Player 1      OthelloModel(contains board info)
 * move ---------> move(Piece, Position)
 *   <----------- move success?
 * 
 * 
 * 
 * @author nothize
 *
 */

public class CommandTest {
	@Test
	public void testGetConsoleCommand() throws Exception {
		ICommand cmd;
		
		CommandDispatcher cd = new CommandDispatcher();
		cmd = cd.getCommand();
	}
	
	@Test
	public void testMoveCommand() throws Exception {
		Board board = new Board();
		Piece piece = Piece.BLACK;
		Position pos = new Position(3, 2);
		
		MoveCommand mc = new MoveCommand(board, piece, pos);
		Assert.assertEquals(board.getPiece(pos), Piece.EMPTY);
		mc.execute();
		Assert.assertEquals(board.getPiece(pos), piece);

		pos = new Position(3, 3);
		mc = new MoveCommand(board, piece, pos);
		Assert.assertEquals(board.getPiece(pos), Piece.WHITE);
		try {
			mc.execute();
			Assert.fail("No InvalidMoveException is throw.");
		} catch ( InvalidMoveException e) {
			Assert.assertEquals(e.getPosition(), pos);
			Assert.assertEquals(board.getPiece(pos), Piece.WHITE);
		}
	}
}
