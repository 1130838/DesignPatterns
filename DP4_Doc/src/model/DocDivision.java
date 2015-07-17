package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class DocDivision {

    StrategyDocument strategyDocument;



    StrategySend strategySend;

    public void performProcessDocument(){
        strategyDocument.process();
    }

    public void performSendDocument(){
        strategySend.send();
    }

    public void setStrategyDocument(StrategyDocument strategyDocument) {
        this.strategyDocument = strategyDocument;
    }

    public void setStrategySend(StrategySend strategySend) {
        this.strategySend = strategySend;
    }



}
