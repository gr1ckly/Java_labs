package main.classes.alive;

import main.classes.groups.RichClass;
import main.exceptions.IncorrectAgeException;
import main.interfaces.FoodInteraction;

public class Sproots extends RichMan implements FoodInteraction {
    public Sproots(String name){
        super(name);
    }
    public Sproots(String name,int age) throws IncorrectAgeException {
        super(name, age);
    }

    @Override
    public String thinkable(){
        return "рассчитывать, что";
    }

    public String toEat(){
        return "обедать";
    }

    public String mayBe(){
        return "может";
    }

    public String needForEat(){
        return "нуждатсья в еде";
    }

    public String toConfess(){
        return "не мог не признаться";
    }

    public String beHonest(){
        return "оставаться честным";
    }
}
