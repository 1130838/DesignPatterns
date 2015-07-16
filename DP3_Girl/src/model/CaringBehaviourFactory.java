package model;

/**
 * Created by bruno.devesa on 16-07-2015.
 */
public class CaringBehaviourFactory {

    public static CaringBehaviour buildCaringBehaviour (CaringTypes caringType) {

        CaringBehaviour caringBehaviour = null;

        switch (caringType){

            case BLOWJOB:
                caringBehaviour = new BlowJob();
                break;
            case KISS:
                caringBehaviour = new Kiss();
                break;
                 }

        return caringBehaviour;
    }

}
