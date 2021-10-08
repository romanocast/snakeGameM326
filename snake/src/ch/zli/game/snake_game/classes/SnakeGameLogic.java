package ch.zli.game.snake_game.classes;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import ch.zli.game.gui.RedrawListener;
import ch.zli.game.snake_game.SnakeGame;

public class SnakeGameLogic {

    Snake snake;
    int headPos = 0;
    char direction = 'U';
    int nextPos = 0;
    boolean intersects;
    Desert desert;
    Food food;
    Opstacles opstacles;
    SnakeGame snakeGame;
    RedrawListener redrawListener;
    Random random;
    private Timer timer;
    Level level;

    //Constructor
    public SnakeGameLogic(){

    }

    public void processTick() {

        headPos = snake.getHeadPos();

        direction = snake.getDirection();

        nextPos = desert.getNextPos(headPos, direction);

        snake.moveTo(nextPos);

        if(food.intersectsWith(headPos)) {
            snake.eat();
            replaceFood();
        }

        if(opstacles.intersectsWith(headPos)) {
            snakeGame.setGameOver();
        }

        if(snake.selfCollision()){
            snakeGame.setGameOver();
        }

        //Force Redraw
    }

    public void replaceFood() {
        random = new Random();

    }

    private void initAfterLevelChanged() {
        // Start paused
    
        // We need a periodical tick for this level
        if (timer != null) {
            timer.cancel();
        }
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                processTick();
            }
        }, 100, level.getLevelVelocity());
    
        // force redraw
    } 
    
    
}