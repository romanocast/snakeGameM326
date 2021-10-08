package ch.zli.game.snake_game.classes;

import java.util.Random;

public class Food {

    int myPos = 0;
    Random random;

    public Food(){
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
