package designpartner.creational.abstractfactory.factories;

import designpartner.creational.abstractfactory.interfacies.Button;
import designpartner.creational.abstractfactory.interfacies.Checkbox;
import designpartner.creational.abstractfactory.objects.LinuxButton;
import designpartner.creational.abstractfactory.objects.LinuxCheckbox;

public class LinuxFactoryUIComponent extends FactoryUIComponent{

    //Objects can relate to each other at creation time using composition

    @Override
    public Button createButton() {
        return new LinuxButton("ok! linux");
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
