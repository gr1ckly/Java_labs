package main.classes.alive;

import main.abstract_classes.Animal;
import main.classes.groups.Animals;

public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }
    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Bird other = (Bird) otherObject;
        return this.getName().equals(other.getName()) && this.getId().equals(other.getId());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + "]";
    }

    @Override
    public int hashCode(){
        return this.getId().hashCode();
    }
}