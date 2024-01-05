package classes.human;
import abstract_classes.*;
import interfaces.*;

public class RichMans extends Person implements DisposalOfProperty, MentalActionable, Actionable {
    private static int count = 0;
    private String id = "RM";
    public RichMans(String name){
        super(name);
        this.id += Integer.toString(count);
        count += 1;
    }

    public RichMans(String name, int number){
        super(name, number);
        this.id += Integer.toString(count);
        count += 1;
    }

    public String thinkable(){
        return "думать о том, как";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String lose(){
        return "потерять";
    }

    public String saved(){
        return "сохранить";
    }

    public String illegalAcquire(){
        return "нажить их обманным путем";
    }

    public String understanding(){
        return "понять, что";
    }

    public String excited(){
        return "теряя сон и аппетит, трястись над";
    }

    public String cheat(){
        return "облапошить кого-нибудь";
    }

    public String defenderFromCheat(){
        return "не дать другим облапошить себя";
    }

    public String exist(){
        return "Быть";
    }

    public String force(){
        return "заставлять работать на себя других";
    }

    public String forcedToWork(){
        return "должен поступить на";
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        RichMans other = (RichMans) otherObject;
        return this.id.equals(other.getId()) && this.name.equals(other.getName());
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
