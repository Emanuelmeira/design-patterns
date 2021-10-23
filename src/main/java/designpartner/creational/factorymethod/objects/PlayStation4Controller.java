package designpartner.creational.factorymethod.objects;

import designpartner.creational.factorymethod.interfacies.Controller;

public class PlayStation4Controller implements Controller {

    private boolean isVibration;

    public PlayStation4Controller(boolean isVibration) {
        this.isVibration = isVibration;
    }

    @Override
    public void pressStart() {
        System.out.println("Start the game");
    }

    @Override
    public void pressSelect() {
        System.out.println("Open console options");
    }

    @Override
    public boolean isVibration() {
        return isVibration;
    }

}
