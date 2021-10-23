package designpartner.creational.factorymethod;

import designpartner.creational.factorymethod.factories.PlayStation4ControllerFactory;
import designpartner.creational.factorymethod.factories.XboxOneSControllerFactory;
import designpartner.creational.factorymethod.interfacies.Controller;

public class CodeConsumer {

    public static void main(String[] args) {
        //playStation4();
        //xboxOneS();

        var playS4Factory = new PlayStation4ControllerFactory();
        controllerService(playS4Factory.factoryController());

        var xboxOneSFactory = new XboxOneSControllerFactory();
        controllerService(xboxOneSFactory.factoryController());
    }

    private static void controllerService(Controller controller) {
        controller.pressStart();
        controller.pressSelect();
        System.out.println("Controller vibration is "+ controller.isVibration());
    }

    private static void xboxOneS() {
        var xboxOneSFactory = new XboxOneSControllerFactory(); // creating factory
        xboxOneSFactory.createAndShowStatusVibration(); // using factory method
    }

    private static void playStation4() {
        var playS4Factory = new PlayStation4ControllerFactory();
        var playStation4Controller =  playS4Factory.factoryController(); // creating object
        playStation4Controller.pressStart();
        playStation4Controller.pressSelect();
        System.out.println("playStation4 Controller vibration is "+ playStation4Controller.isVibration());
    }


    //### Factory Method
    //- Abstrai a logica de criação do objeto
    //- Trabalha com herança
    //- Eliminar a duplicação de código na criação de objetos
    //- Delega para subclasses a lógica de criação dos objetos
    //- Ajuda na aplicação do Open/closed
    //- Ajuda na aplicação do single responsibility principle
    //
    //- aumenta o numero de subclass, porque para cada objeto concreto, temos uma subclass
    //
    //Font: https://youtu.be/1rB0PhvAwiU
}
