package main.classes.groups;

import main.abstract_classes.*;

import java.util.ArrayList;

public class FlowersClass extends Group{
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public FlowersClass(String name){
        super(name);
    }

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
            FlowersClass.Flower other = (Flower) otherObject;
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

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void addFlower(Flower flower){
        this.flowers.add(flower);
    }

    public void removeFlower(Flower flower){
        this.flowers.remove(flower);
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        FlowersClass other = (FlowersClass) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.getFlowers().equals(other.getFlowers());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", flowers=" + this.getFlowers().toString() + "]";
    }
}