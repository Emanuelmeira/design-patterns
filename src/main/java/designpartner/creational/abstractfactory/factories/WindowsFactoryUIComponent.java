package designpartner.creational.abstractfactory.factories;

import designpartner.creational.abstractfactory.interfacies.Button;
import designpartner.creational.abstractfactory.interfacies.Checkbox;
import designpartner.creational.abstractfactory.objects.WindowsButton;
import designpartner.creational.abstractfactory.objects.WindowsCheckbox;

public class WindowsFactoryUIComponent extends FactoryUIComponent{

    //Objects can relate to each other at creation time using composition
    // can be singleton class

    @Override
    public Button createButton() {
        return new WindowsButton("ok! win");
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
