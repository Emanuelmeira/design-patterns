package designpartner.creational.abstractfactory.objects;

import designpartner.creational.abstractfactory.interfacies.Button;

public class MacButton implements Button {

    public MacButton(String label) {
        this.label = label;
    }

    private String label;

    @Override
    public void click() {
        System.out.println("click no botão Mac");
    }

    @Override
    public String getLabel() {
        return label;
    }
}
