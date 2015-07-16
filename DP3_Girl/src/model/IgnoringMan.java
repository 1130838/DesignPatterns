package model;

import java.awt.event.MouseAdapter;

/**
 * Created by bruno.devesa on 16-07-2015.
 */
public class IgnoringMan implements MadBehaviour {
    @Override
    public void beBitch() {
        System.out.println("i'm ignoring my boyfriend");
    }
}
