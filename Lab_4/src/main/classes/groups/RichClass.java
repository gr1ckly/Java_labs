package main.classes.groups;

import main.abstract_classes.Group;
import main.abstract_classes.Person;
import main.exceptions.IncorrectAgeException;
import main.interfaces.Beggining;
import main.interfaces.DisposalOfProperty;
import main.interfaces.Thinkable;

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

    public static class RichMan extends Person implements DisposalOfProperty, Thinkable, Beggining {
        public RichMan(String name){
            super(name);
        }
        public RichMan(String name,int age){
            super(name, age);
        }

        @Override
        public String thinkable(){
            return "думать о том, как";
        }


        public String understanding(){
            return "понять, что";
        }

        public String excited(){
            return "теряя сон и аппетит, трястись над";
        }

        public String cheat(){
            return "обмануть";
        }

        public String defenderFromCheat(){
            return "не дать другим обмануть себя";
        }

        public String exist(){
            return "быть";
        }

        public String slavery(){
            return "заставлять работать на себя других";
        }

        public String toWork(){
            return "работать";
        }

        public String pass(){
            return "сдать";
        }

        public String forsed(){
            return "вынужден";
        }

        public String want(){
            return "хотеть";
        }

        @Override
        public String walking(){
            return "идти";
        }

        @Override
        public String giveAway(){
            return "отдать";
        }

        @Override
        public String start(){
            return "начать";
        }

        @Override
        public String saved(){
            return "сохранить";
        }

        @Override
        public String lost(){
            return "потерять";
        }

        @Override
        public String illegalAcquire(){
            return "нажить обманным путем";
        }

        @Override
        public boolean equals(Object otherObject){
            if (!super.equals(otherObject)) return false;
            RichClass.RichMan other = (RichClass.RichMan) otherObject;
            return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.age == other.getAge();
        }

        @Override
        public String toString(){
            return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", age=" + this.getAge() + "]";
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
