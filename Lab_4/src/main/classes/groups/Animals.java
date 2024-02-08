package main.classes.groups;

import main.abstract_classes.Animal;
import main.abstract_classes.Group;
import main.interfaces.Beggining;
import main.interfaces.FoodInteraction;
import main.interfaces.SwimAbility;

import java.util.ArrayList;

public class Animals extends Group {
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public Animals(String name) {
        super(name);
    }

    public Animals(String name, Animal... animals) {
        super(name);
        for (Animal animal : animals) {
            this.animals.add(animal);
        }
    }

    public ArrayList<Animal> getAnimals() {
        return this.animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        this.animals.remove(animal);
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Animals other = (Animals) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.getAnimals().equals(other.getAnimals());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", animals=" + this.getAnimals().toString() + "]";
    }
}