package designpartner.creational.factorymethod.objects;

import designpartner.creational.factorymethod.interfacies.Controller;

public class XboxOneSController implements Controller {

    private boolean isVibration;

    public XboxOneSController(boolean isVibration) {
        this.isVibration = isVibration;
    }

    @Override
    public void pressStart() {
        System.out.println("Pause the game");
    }

    @Override
    public void pressSelect() {
        System.out.println("Open game options");
    }

    @Override
    public boolean isVibration() {
        return isVibration;
    }
}
