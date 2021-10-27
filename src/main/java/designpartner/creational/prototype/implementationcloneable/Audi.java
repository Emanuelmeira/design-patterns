package designpartner.creational.prototype.implementationcloneable;

public class Audi implements Cloneable{

    public int value;
    public Seat seat;

    //shallow copy only fields of primitive data type are copied while the objects references are not copied
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", seat=" + seat +
                '}';
    }
}
