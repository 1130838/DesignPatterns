package presentation;

import model.Duck;
import model.RedHeadDuck;
import model.RubberDuck;

/**
 * Created by brunodevesa on 15/07/15.
 */
public class MainUI {

    public void run() {
        System.out.println("creating a real duck..");
        Duck d1 = new RedHeadDuck("realdDuck1", 5);
        System.out.println("making this one making a sound..");
        d1.performQuack();


        System.out.println("\ncreating a rubber duck..");
        Duck d2 = new RubberDuck("rubberdDuck1", 1);
        System.out.println("making this one making a sound..");
        d2.performQuack();



    }

}
