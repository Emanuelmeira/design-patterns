package designpartner.creational.prototype.implementation;

import java.util.Objects;

public abstract class Prototype {

    public int weight;

    public Prototype() {}

    //process for cloning elements shared by the superclass if they exist
    public Prototype(Prototype prototype){
        if(Objects.nonNull(prototype)){
            this.weight = prototype.weight;
        }
    }

    public abstract Prototype clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prototype prototype = (Prototype) o;
        return weight == prototype.weight;
    }
}
