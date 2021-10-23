package designpartner.creational.abstractfactory;

import designpartner.creational.abstractfactory.factories.FactoryUIComponent;
import designpartner.creational.abstractfactory.factories.LinuxFactoryUIComponent;
import designpartner.creational.abstractfactory.factories.MacFactoryUIComponent;
import designpartner.creational.abstractfactory.factories.WindowsFactoryUIComponent;
import designpartner.creational.abstractfactory.interfacies.Button;
import designpartner.creational.abstractfactory.interfacies.Checkbox;

import java.util.Objects;

public class CodeConsumer {

    public static void main(String[] args) {

        var osName = System.getProperty("os.name");
        FactoryUIComponent factoryUIComponent = null;

        if(Objects.equals(osName, "Linux")){
            factoryUIComponent = new LinuxFactoryUIComponent();
        } else if (Objects.equals(osName, "Windows 10")){
            factoryUIComponent = new WindowsFactoryUIComponent();
        }else {
            factoryUIComponent = new MacFactoryUIComponent();
        }

        createComponents(factoryUIComponent);
    }

    private static void createComponents(FactoryUIComponent factoryUIComponent) {
        var button = factoryUIComponent.createButton();
        var checkbox = factoryUIComponent.createCheckbox();
        checkbox.setCheck(true);

        useButton(button);
        useCheckBox(checkbox);
    }

    private static void useButton(Button button) {
        button.click();
        button.getLabel();
    }

    private static void useCheckBox(Checkbox checkbox) {
        var check = checkbox.isChecked();
        if(check){
           System.out.println("disable check");
           checkbox.removeCheck();
        }
    }


}
