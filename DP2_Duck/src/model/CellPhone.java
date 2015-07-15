package model;

/**
 * Created by brunodevesa on 15/07/15.
 */
public class CellPhone {

    QuackBehaviour quackBehaviour;

    public CellPhone() {

        quackBehaviour = new Quack();

    }

    public void performQuack() {

        quackBehaviour.quack();
    }


}
