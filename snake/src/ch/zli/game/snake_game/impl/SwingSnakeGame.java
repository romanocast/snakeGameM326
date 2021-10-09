package ch.zli.game.snake_game.impl;

import javax.swing.JPanel;

import ch.zli.game.gui.RedrawListener;
import ch.zli.game.gui.SwingGameGui;
import ch.zli.game.gui.GamePainter;
import ch.zli.game.snake_game.SnakeGame;

import java.awt.Graphics2D;

public class SwingSnakeGame implements GamePainter, RedrawListener {

	private SnakeGame snakeGame;
	private SwingGameGui snakeGui;

	/**
	 * Create the game and the GUI. Set ourself as the command handler and the
	 * game painter.
	 */
	public SwingSnakeGame() {
		snakeGame = new SnakeGame(this);
		snakeGui = new SwingGameGui("Snake - The Game");
		snakeGui.addGameCommandListener(snakeGame);
		snakeGui.setGamePainter(this);
	}

	/**
	 * Called by the GUI. Create an actual status painter object and dispatch 
	 * the draw request to the game.
	 */
@Override
	public void drawStatus(JPanel panel, Graphics2D g) {
		snakeGame.redrawStatus(new SwingSnakeStatusPainter(panel, g));
	}

	/**
	 * Called by the GUI. Create an actual scene painter object and dispatch the	 * the draw request to the game.
	 */
	@Override
	public void drawScene(JPanel panel, Graphics2D g) {
		snakeGame.redrawScene(new SwingSnakeGamePainter(panel, g));
	}

	/** Tell the GUI that the game must be redrawn */
	@Override
	public void gameNeedsRedraw() {
		if (snakeGui != null) {
			snakeGui.repaint();
		}
	}
}
