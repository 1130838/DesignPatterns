package model;

/**
 * Created by bruno.devesa on 16-07-2015.
 */
public class Kiss implements CaringBehaviour {
    @Override
    public void takeCare() {
        System.out.println("muah! i'm kissing!");
    }
}
