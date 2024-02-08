package main.classes.alive;

import main.abstract_classes.Animal;
import main.classes.groups.Animals;
import main.interfaces.Beggining;
import main.interfaces.FoodInteraction;
import main.interfaces.SwimAbility;

public class Duck extends Animal implements SwimAbility, FoodInteraction, Beggining {

    public Duck(String name) {
        super(name);
    }

    public String getUsed(){
        return "привыкнуть";
    }

    @Override
    public String swim() {
        return "подплыть";
    }

    @Override
    public String toEat() {
        return "клевать";
    }

    @Override
    public String start(){
        return "начать";
    }

    public String findOut() {
        return "узнавать";
    }

    public String hurry() {
        return "спешить";
    }

    public String seeAround() {
        return "увидеть издали";
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Duck other = (Duck) otherObject;
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