package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class Pedido implements StrategyDocument {
    @Override
    public void process() {
        System.out.println("im processing a requirement");
    }
}
