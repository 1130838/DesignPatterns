package model;

/**
 * Created by bruno.devesa on 15-07-2015.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(String name, int age) {

        super(name, age);
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();

    }



}
