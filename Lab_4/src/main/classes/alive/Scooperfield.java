package main.classes.alive;

import main.classes.groups.RichClass;
import main.exceptions.IncorrectAgeException;
import main.interfaces.Emotions;
import main.interfaces.FoodInteraction;
import main.interfaces.PermissionInteractive;
import main.interfaces.WorldInteraction;

import java.util.ArrayList;

public class Scooperfield extends RichMan implements Emotions, FoodInteraction, PermissionInteractive, WorldInteraction {
    private ArrayList<String> clothes = new ArrayList<String>();

    public Scooperfield(String name){
        super(name);
    }
    public Scooperfield(String name,int age) throws IncorrectAgeException {
        super(name, age);
    }

    public void putOn(String clothe){
        class Clothes{
            private String name;
            public Clothes(String name){
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        Clothes clothes1 = new Clothes(clothe);
        this.clothes.add(clothes1.getName());
    }

    public String getClothes(){
        String clothe = "";
        for (String clothes1:this.clothes){
            clothe += clothes1 + " ";
        }
        return clothe + this.name;
    }

    @Override
    public String permission(){
        return "просить разрешение";
    }

    public String calling(){
        return "называть по именам";
    }

    public String clinbOver(){
        return "перелезть через";
    }

    public String pet(){
        return "гладить";
    }

    public String kissingGoodbye(){
        return "целовать на прощание";
    }

    public String go(){
        return "отправляться";
    }

    public String happy(){
        return "Счастливый " + this.name;
    }

    public String meeting(String name){
        class Friend{
            private String name;
            public Friend(String name){
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        Friend friend = new Friend(name);
        return "уезжать с " + friend.getName();
    }

    @Override
    public String breath(){
        return "дышать свежим воздухом";
    }

    @Override
    public String toHear(){
        return "слушать пение";
    }

    @Override
    public String toSee(){
        return "глядеть на";
    }

    @Override
    public String thinkable(){
        return "запомнить названия";
    }

    @Override
    public String toBeTouched(){
        return "умиляться";
    }

    @Override
    public String joy(){
        return "радоваться";
    }

    @Override
    public String toEat(){
        return "скормить";
    }

    public String toThrow(){
        return "бросать";
    }
}
