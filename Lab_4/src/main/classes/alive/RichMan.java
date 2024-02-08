package main.classes.alive;

import main.abstract_classes.Person;
import main.classes.groups.RichClass;
import main.interfaces.Beggining;
import main.interfaces.DisposalOfProperty;
import main.interfaces.Thinkable;

public class RichMan extends Person implements DisposalOfProperty, Thinkable, Beggining {
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
        RichMan other = (RichMan) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.age == other.getAge();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", age=" + this.getAge() + "]";
    }
}