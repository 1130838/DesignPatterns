package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class StrategyDocumentFactory {

    public static StrategyDocument buildStrategyDocument (AssuntoType assuntoType){
        StrategyDocument strategyDocument1 = null;

        switch (assuntoType){
            case RECLAMACAO:
                strategyDocument1 = new Reclamacao();
                break;
            case SUGESTAO:
                strategyDocument1 = new Sugestao();
                break;
            case PEDIDO:
                strategyDocument1 = new Pedido();
                break;
            case OUTRO:
                strategyDocument1 = new OutroAssunto();
                break;
        }
        return strategyDocument1;
    }
}
