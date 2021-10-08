package ch.zli.game.snake_game;

import javax.swing.SwingUtilities;

import ch.zli.game.gui.SwingGameGui;

public class SnakeGameApp {
    public static void main(String[] args) {
        // Do not ask, always do it this way
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // We need a game and a gui
                SnakeGame game = new SnakeGame();
                SwingGameGui gui = new SwingGameGui("Example App");

                // Add the game to the gui ...
                gui.addGameCommandListener(game);
                gui.setGamePainter(game);

                // and the gui to the game
                game.setRedrawListener(gui);

                // Show the gui
                gui.setVisible(true);
            }
        });
    }
}
