package designpartner.creational.factorymethod.factories;

import designpartner.creational.factorymethod.interfacies.Controller;
import designpartner.creational.factorymethod.objects.PlayStation4Controller;

public class PlayStation4ControllerFactory extends ControllerFactory{

    //may contain specific business rules
    // can be singleton class
    @Override
    public Controller factoryController() {
        return new PlayStation4Controller(true);
    }


}
