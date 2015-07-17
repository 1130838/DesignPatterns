package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class Reclamacao implements StrategyDocument {

    @Override
    public void process() {
        System.out.println("im processing a reclamation");
    }
}
