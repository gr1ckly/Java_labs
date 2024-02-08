package main.records;

import main.abstract_classes.Person;
import main.classes.groups.FlowersClass;

public record Flower(String name){
    private static int count =0;
    public Flower(String name){
        this.name = name + Integer.toString(count);
        this.count += 1;
    }
    public String exist(){
        return "есть";
    }

    public String beNative(Person person){
        return "стать близкими для " + person.getName();
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Flower other = (Flower) otherObject;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + "]";
    }
}