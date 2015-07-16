
package presentation;

import model.*;

/**
 * Created by brunodevesa on 15/07/15.
 */
public class MainUI {

    public void run() {

        // portuguese girl
        System.out.println("creating a new portuguese girl..");
        RussianGirl pg1 = new RussianGirl("Paula", 38, 78);
        System.out.println("adding her caring behaviour..");

        CaringBehaviour caringBehaviour = CaringBehaviourFactory.buildCaringBehaviour(CaringTypes.KISS);

        pg1.setCaringBehaviour(caringBehaviour);

        System.out.println("portuguese girl will perform her caring behaviour...");
        pg1.performCaringBehaviour();

        System.out.println("You screw up - pt girl will change her behaviour.. ");
        MadBehaviour madBehaviour = MadBehaviourFactory.buildMadBehaviour(MadTypes.REFUSESEX);

        pg1.setMadBehaviour(madBehaviour);

        System.out.println("portuguese girl will perform her mad behaviour...");
        pg1.performMadBehaviour();

        // ---

        // russian girl
        System.out.println("\ncreating a new russian girl..");
        RussianGirl rg1 = new RussianGirl("Tatyana", 28, 50);

        System.out.println("adding her caring behaviour..");

        CaringBehaviour caringBehaviour1 = CaringBehaviourFactory.buildCaringBehaviour(CaringTypes.BLOWJOB);

        rg1.setCaringBehaviour( caringBehaviour1);
        System.out.println("russian girl will perform her caring behaviour...");
        rg1.performCaringBehaviour();

        System.out.println("You screw up - russian girl will change her behaviour.. ");

        MadBehaviour madBehaviour1 = MadBehaviourFactory.buildMadBehaviour(MadTypes.IGNORINGMAN);

        pg1.setMadBehaviour(madBehaviour1);
        System.out.println("russian girl will perform her mad behaviour...");
        pg1.performMadBehaviour();

    }

}
