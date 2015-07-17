package model;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class EnvioType_A implements StrategySend {
    @Override
    public void send() {
        System.out.println("im sending the doc as a funcionario type A");
    }
}
