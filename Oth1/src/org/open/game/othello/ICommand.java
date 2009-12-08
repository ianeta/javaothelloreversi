package org.open.game.othello;

public interface ICommand {
	public abstract void execute() throws InvalidCommandException;
}