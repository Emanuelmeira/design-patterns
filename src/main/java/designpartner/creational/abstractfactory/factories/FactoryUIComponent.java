package designpartner.creational.abstractfactory.factories;

import designpartner.creational.abstractfactory.interfacies.Button;
import designpartner.creational.abstractfactory.interfacies.Checkbox;

public abstract class FactoryUIComponent {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
