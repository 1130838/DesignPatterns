package presentation;

import model.*;

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


        // --------------------

        System.out.println("\nCreating a model duck");
        ModelDuck modelDuck1 = new ModelDuck("modelDuck", 0);


        System.out.println("\nnow will make behaviours change dynamically  (in run time) ");

        System.out.println("model duck created...in the beggining he dont know how to fly..");
        modelDuck1.performFly();
        System.out.println("setting the model duck to fly..");
        modelDuck1.setFlyBehaviour(new FlyWithWings());
        modelDuck1.performFly();

        modelDuck1.performQuack();


        // ------

        System.out.println("\neven a cell phone can implement the quackBehaviour and make its sound..");
        CellPhone cellPhone = new CellPhone();
        cellPhone.performQuack();

    }




}
