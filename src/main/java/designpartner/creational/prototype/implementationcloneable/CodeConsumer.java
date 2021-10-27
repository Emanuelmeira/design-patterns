package designpartner.creational.prototype.implementationcloneable;

public class CodeConsumer {

    //https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/
    public static void main(String[] args) throws CloneNotSupportedException {
        //shallowCopy();
        deepCopy();
    }

    private static void deepCopy() throws CloneNotSupportedException {

        var seat = new Seat();
        seat.type = "leather";

        var bmw = new Bmw();
        bmw.value = 100;
        bmw.seat = seat;

        var bmwClone = (Bmw) bmw.clone();

        System.out.println("modifying internal object from original object");
        bmw.seat.type = "old leather";
        System.out.println("BMW: "+ bmw);
        System.out.println("BMW Clone: "+ bmwClone);

        //clone object is not affected by modification of the original
    }

    private static void shallowCopy() throws CloneNotSupportedException {
        var seat = new Seat();
        seat.type = "leather";

        var audi = new Audi();
        audi.value = 100;
        audi.seat = seat;

        var audiClone = (Audi) audi.clone();

        System.out.println("modifying internal object from original object");
        audi.seat.type = "old leather";
        System.out.println("Car: "+ audi);
        System.out.println("CarClone: "+ audiClone);

        // Clone Object is affected by modification
    }
}
