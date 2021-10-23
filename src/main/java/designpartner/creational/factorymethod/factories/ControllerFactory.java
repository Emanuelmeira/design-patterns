package designpartner.creational.factorymethod.factories;

import designpartner.creational.factorymethod.interfacies.Controller;

public abstract class ControllerFactory {

    //may contain general business rules

    abstract Controller factoryController();

    public void createAndShowStatusVibration(){
        var controller = factoryController();
        System.out.println("Vibration is: "+ controller.isVibration());
    }

    public void createAndUse(){
        var controller = factoryController();
        controller.pressSelect();
        controller.pressStart();
        System.out.println("Vibration is: "+ controller.isVibration());
    }


}
