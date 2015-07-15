package model;

/**
 * Created by bruno.devesa on 15-07-2015.
 */
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("im a duck toy. i can't really fly.. ");
    }
}
