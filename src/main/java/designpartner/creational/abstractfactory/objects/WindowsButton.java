package designpartner.creational.abstractfactory.objects;

import designpartner.creational.abstractfactory.interfacies.Button;

public class WindowsButton implements Button {

    public WindowsButton(String label) {
        this.label = label;
    }

    private String label;

    @Override
    public void click() {
        System.out.println("click no botão windows");
    }

    @Override
    public String getLabel() {
        return label;
    }


}
