package designpartner.creational.abstractfactory.objects;

import designpartner.creational.abstractfactory.interfacies.Button;

public class LinuxButton implements Button {

    private String label;

    public LinuxButton(String label) {
        this.label = label;
    }

    @Override
    public void click() {
        System.out.println("click no botão Linux");
    }

    @Override
    public String getLabel() {
        return label;
    }
}
