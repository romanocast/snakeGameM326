package ch.zli.game.snake_game.classes;

import java.util.Random;

public class Opstacles {
    
    int myPos;
    Random random;

    public Opstacles(){
        random = new Random();
        this.myPos = random.nextInt(50);
    }

    public boolean intersectsWith(int headPos) {

        if(myPos == headPos) {
            return true;
        }
        return false;
    }
}
