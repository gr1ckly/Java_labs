package main.classes.alive;

import main.abstract_classes.Person;
import main.exceptions.IncorrectAgeException;
import main.interfaces.ForcedAbility;
import main.interfaces.Thinkable;

public class Workman extends Person implements Thinkable, ForcedAbility {
    public Workman(String name){
        super(name);
    }
    public Workman(String name, int age) throws IncorrectAgeException {
        super(name, age);
    }

    public String build(){
        return "построить";
    }

    @Override
    public String thinkable(){
        return "считать, что";
    }

    public String issuedAnOrder(){
        return "издать приказ";
    }

    public String toRun(){
        return "сбежать";
    }

    @Override
    public String walking(){
        return "подойти";
    }

    @Override
    public String forcedTo(){
        return "нуждаться";
    }

    public String exist(){
        return "есть";
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Workman other = (Workman) otherObject;
        return this.getId().equals(other.getId()) && this.name.equals(other.getName()) && this.getAge()==other.getAge();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", age=" + this.getAge() + "]";
    }
}