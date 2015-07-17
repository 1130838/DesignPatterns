
package presentation;

import model.*;

/**
 * Created by brunodevesa on 15/07/15.
 */
public class MainUI {

    public void run() {

        System.out.println("creating the Doc division");
        DocDivision docDivision = new DocDivision();

        System.out.println("\ncreating a new pedido type document");
        StrategyDocument strategyDocument = StrategyDocumentFactory.buildStrategyDocument(AssuntoType.PEDIDO);
        docDivision.setStrategyDocument(strategyDocument);
        docDivision.performProcessDocument();


        System.out.println("\ncreating a funcionario..");
        Funcionario f1 = new Funcionario_TypeA();

        System.out.println("\nsending a the document by functionary type A..");
        StrategySend strategySend = StrategySendFactory.buildStrategySendDocument(FuncionarioType.FUNCIONARIO_TYPE_A);

        docDivision.setStrategySend(strategySend);
        docDivision.performSendDocument();

        System.out.println("\nnow the same doc will be sent as type B funcionario..");
        StrategySend strategySend1 = StrategySendFactory.buildStrategySendDocument(FuncionarioType.FUNCIONARIO_TYPE_B);
        docDivision.setStrategySend(strategySend1);
        docDivision.performSendDocument();

    }


}


