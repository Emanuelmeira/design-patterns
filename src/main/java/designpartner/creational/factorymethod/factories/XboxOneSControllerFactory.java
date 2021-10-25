package designpartner.creational.factorymethod.factories;

import designpartner.creational.factorymethod.interfacies.Controller;
import designpartner.creational.factorymethod.objects.XboxOneSController;

public class XboxOneSControllerFactory extends ControllerFactory{

    //may contain specific business rules
    // can be singleton class
    @Override
    public Controller factoryController() {
        return new XboxOneSController(true);
    }


}
