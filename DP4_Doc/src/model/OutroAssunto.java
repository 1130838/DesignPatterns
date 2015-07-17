package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class OutroAssunto implements StrategyDocument {
    @Override
    public void process() {
        System.out.println("im processing another assunto type");
    }
}
