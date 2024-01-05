package classes.human;
import abstract_classes.*;

public class Workers extends Person {
    private static int count = 0;
    private String id = "WK";
    public Workers(String name){
        super(name);
        this.id += Integer.toString(count);
        count += 1;
    }

    public Workers(String name, int number){
        super(name, number);
        this.id += Integer.toString(count);
        count += 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String thinkable(){
        return "считали, что";
    }

    public String issuedAnOrder(){
        return "издали приказ";
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Workers other = (Workers) otherObject;
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
