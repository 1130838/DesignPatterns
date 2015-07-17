package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class StrategySendFactory {


    public static StrategySend buildStrategySendDocument (FuncionarioType funcionarioType){

    StrategySend strategySend = null;
        switch (funcionarioType){
            case FUNCIONARIO_TYPE_A:
                strategySend = new EnvioType_A();
            case FUNCIONARIO_TYPE_B:
                strategySend = new EnvioType_B();
                break;
            case FUNCIONARIO_TYPE_OTHER:
                break;
        }

        return strategySend;
    }
}
