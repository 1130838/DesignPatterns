package model;

/**
 * Created by bruno.devesa on 15-07-2015.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("im no real duck, i can't quack, just squeak..");
    }
}
