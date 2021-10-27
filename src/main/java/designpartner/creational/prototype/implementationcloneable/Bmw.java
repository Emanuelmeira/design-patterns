package designpartner.creational.prototype.implementationcloneable;

import java.util.Objects;

public class Bmw implements Cloneable{

    public int value;
    public Seat seat;

    //Deep copy involves the copy of primitive data type as well as object references
    public Object clone() throws CloneNotSupportedException {
        Bmw bmw = (Bmw) super.clone(); // copy primitives type

        if(Objects.nonNull(seat)){
            bmw.seat = new Seat();
            bmw.seat = this.seat.clone();
        }
        return bmw;
    }


    @Override
    public String toString() {
        return "Bmw{" +
                "value=" + value +
                ", seat=" + seat +
                '}';
    }
}
