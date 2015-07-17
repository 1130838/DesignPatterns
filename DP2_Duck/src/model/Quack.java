package model;

/**
 * Created by bruno.devesa on 15-07-2015.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
