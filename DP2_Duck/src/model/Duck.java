package model;

/**
 * Created by brunodevesa on 15/07/15.
 */
public abstract class Duck  {

    String name;
    int age;

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("i'm swimming in water");
    }

    public void setFlyBehaviour (FlyBehaviour newFlyBehaviour){
        flyBehaviour = newFlyBehaviour;
    }

    public void setQuackBehaviour (QuackBehaviour newQuackBehaviour){
        quackBehaviour = newQuackBehaviour;
    }


}
