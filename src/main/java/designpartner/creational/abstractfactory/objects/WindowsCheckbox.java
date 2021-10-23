package designpartner.creational.abstractfactory.objects;

import designpartner.creational.abstractfactory.interfacies.Checkbox;

public class WindowsCheckbox implements Checkbox {

    private boolean check;

    @Override
    public boolean isChecked() {
        return check;
    }

    @Override
    public void setCheck(boolean status) {
        this.check = status;
    }

    @Override
    public void removeCheck() {
        this.check = false;
    }
}
