package designpartner.creational.prototype.implementationcloneable;

import java.util.Objects;

public class Seat implements Cloneable{

    public String type;

    public Seat clone() throws CloneNotSupportedException {
        Seat seat = (Seat) super.clone(); // copy primitive types
        seat.type = this.type;
        return seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(type, seat.type);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "type='" + type + '\'' +
                '}';
    }
}
