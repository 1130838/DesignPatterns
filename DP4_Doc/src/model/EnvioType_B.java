package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class EnvioType_B implements StrategySend {
    @Override
    public void send() {
        System.out.println("im sending the doc as a funcionario type B");
    }
}
