package org.open.game.othello;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CommandDispatcher {
	BlockingQueue<ICommand> q = new ArrayBlockingQueue<ICommand>(10);
	
	public void addCommand(ICommand cmd) throws InterruptedException {
		q.put(cmd);
	}
	
	public ICommand getCommand() throws InterruptedException {
		return q.take();
	}
}
