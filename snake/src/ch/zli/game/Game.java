package ch.zli.game;

import ch.zli.game.gui.GameCmdListener;
import ch.zli.game.gui.GamePainter;
import ch.zli.game.gui.RedrawListener;
import ch.zli.game.snake_game.classes.SnakeGameLogic;

public abstract class Game implements GameCmdListener, GamePainter {
    private RedrawListener redrawListener;
    private SnakeGameLogic snakeGameLogic;

    public void setRedrawListener(RedrawListener redrawListener) {
        this.redrawListener = redrawListener;
    }

    public void gameNeedsRedraw() {
        if (redrawListener != null) {
            redrawListener.gameNeedsRedraw();
        }
    }

    public void setGameOver() {

    }

    public void forceRedraw() {
        
    }
}
