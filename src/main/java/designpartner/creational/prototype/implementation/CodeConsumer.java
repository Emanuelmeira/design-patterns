package designpartner.creational.prototype.implementation;

public class CodeConsumer {

    public static void main(String[] args) {

        //rustic implementation

        var owner = new Owner();
        owner.setName("jake");

        var dog = new Dog(5, "mike", owner);
        var dogClone = (Dog) dog.clone();

        if(dog != dogClone){
            System.out.println("objects are differences");
            if(dog.equals(dogClone)){
                System.out.println(" and has the same characteristics");
            }
        }else {
            System.out.println("objects are equals");
        }

        System.out.println("---------------------------------------");
        System.out.println("changing owners name of original object to peter");
        dog.getOwner().setName("peter");
        System.out.println(dog.getOwner().getName());
        System.out.println("object clone not affected: "+dogClone.getOwner().getName());




    }
}
