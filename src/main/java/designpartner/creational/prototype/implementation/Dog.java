package designpartner.creational.prototype.implementation;


import java.util.Objects;

public class Dog extends Prototype {

    private int age;
    private String name;
    private Owner owner;

    public Dog(int age, String name, Owner owner) {
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    public Dog(Dog target) {
        super(target); // copy data of superClass
        if(Objects.nonNull(target)) {
            this.age = target.age;
            this.name = target.name;

            // make deep copy
            if(Objects.nonNull(target.owner)) { // If the class uses composition
                this.owner = new Owner();
                this.owner.setName(target.owner.getName());
            }
        }
    }

    @Override
    public Prototype clone() {
        return new Dog(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(owner, dog.owner);
    }
}
