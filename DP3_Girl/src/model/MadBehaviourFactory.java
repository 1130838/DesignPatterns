package model;

/**
 * Created by bruno.devesa on 16-07-2015.
 */
public class MadBehaviourFactory {


    public static MadBehaviour buildMadBehaviour(MadTypes madTypes){

    MadBehaviour madBehaviour = null;

        switch (madTypes){
            case REFUSESEX:
                madBehaviour = new RefuseSex();
                break;
            case IGNORINGMAN:
                madBehaviour = new IgnoringMan();

        }
        return madBehaviour;
    }


}
