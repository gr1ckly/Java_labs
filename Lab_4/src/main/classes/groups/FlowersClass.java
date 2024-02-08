package main.classes.groups;

import main.abstract_classes.*;
import main.records.*;
import java.util.ArrayList;

public class FlowersClass extends Group{
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public FlowersClass(String name){
        super(name);
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