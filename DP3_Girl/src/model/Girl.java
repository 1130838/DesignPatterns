package model;

/**
 * Created by bruno.devesa on 16-07-2015.
 */
public abstract class Girl {

    String name;
    int age;
    double weight;
    CaringBehaviour caringBehaviour;
    MadBehaviour madBehaviour;

    public Girl(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void performCaringBehaviour(){
        caringBehaviour.takeCare();
    }

    public void performMadBehaviour(){
        madBehaviour.beBitch();
    }

    public void setCaringBehaviour(CaringBehaviour caringBehaviour) {
        this.caringBehaviour = caringBehaviour;
    }

    public void setMadBehaviour(MadBehaviour madBehaviour) {
        this.madBehaviour = madBehaviour;
    }
}
