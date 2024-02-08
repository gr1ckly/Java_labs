package main.classes.groups;

import main.abstract_classes.Group;
import main.abstract_classes.Person;
import main.exceptions.IncorrectAgeException;
import main.interfaces.Beggining;
import main.interfaces.DisposalOfProperty;
import main.interfaces.Thinkable;
import main.classes.alive.*;

import java.util.ArrayList;

public class RichClass extends Group {
    private ArrayList<RichMan> richmans = new ArrayList<RichMan>();

    public RichClass(String name){
        super(name);
    }

    public RichClass(String name, RichMan... richmen){
        super(name);
        for (RichMan richman:richmen){
            this.richmans.add(richman);
        }
    }

    public ArrayList<RichMan> getRichmen() {
        return this.richmans;
    }

    public void setRichmen(ArrayList<RichMan> richmen) {
        this.richmans = richmen;
    }

    public void addRichman(RichMan richman){
        this.richmans.add(richman);
    }

    public void removeRichman(RichMan richman){
        this.richmans.remove(richman);
    }

    public void createAndAddRichman(String name){
        RichMan richman = new RichMan(name);
        this.richmans.add(richman);
    }

    public void createAndAddRichman(String name, int age){
        RichMan richman = new RichMan(name);
        try {
            richman.setAge(age);
        } catch (IncorrectAgeException e) {
            throw new RuntimeException(e);
        }
        this.richmans.add(richman);
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        RichClass other = (RichClass) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.getRichmen().equals(other.getRichmen());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", richmen=" + this.getRichmen().toString() + "]";
    }
}
