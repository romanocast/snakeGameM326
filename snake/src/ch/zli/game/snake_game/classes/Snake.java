package ch.zli.game.snake_game.classes;

public class Snake {

    int headPos;
    char direction;

    public Snake(){
        this.headPos = 1;
        this.direction = 'R';
    }

    public int getHeadPos() {
        return headPos;
    }

    public char getDirection() {
        return direction;
    }

    public void moveTo(int nextPos) {

    }

    public void eat() {

    }

    public boolean selfCollision() {
        //if self collided
        return true;

    }
    
}
