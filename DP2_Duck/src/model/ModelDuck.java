package model;

/**
 * Created by bruno.devesa on 15-07-2015.
 */
public class ModelDuck extends Duck {

    public ModelDuck(String name, int age) {
        super(name, age);
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
}
