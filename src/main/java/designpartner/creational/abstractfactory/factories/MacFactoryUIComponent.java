package designpartner.creational.abstractfactory.factories;

import designpartner.creational.abstractfactory.interfacies.Button;
import designpartner.creational.abstractfactory.interfacies.Checkbox;
import designpartner.creational.abstractfactory.objects.MacButton;
import designpartner.creational.abstractfactory.objects.MacCheckbox;

public class MacFactoryUIComponent extends FactoryUIComponent{

    //Objects can relate to each other at creation time using composition
    // can be singleton class

    @Override
    public Button createButton() {
        return new MacButton("ok! mac");
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
