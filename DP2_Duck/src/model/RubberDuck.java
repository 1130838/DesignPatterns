package model;

/**
 * Created by bruno.devesa on 15-07-2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck(String name, int age) {
        super(name, age);
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }


}
