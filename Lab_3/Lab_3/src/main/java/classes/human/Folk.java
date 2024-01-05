package classes.human;
import abstract_classes.Person;

public class Folk extends Person {
    private int count = 0;
    private String id = "FK";
    public Folk(String name){
        super(name);
        this.id += Integer.toString(count);
        count+= 1;
    }

    public Folk(String name, int number){
        super(name, number);
        this.id += Integer.toString(count);
        count+= 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String thinkable(){
        return "возмущается, что";
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Folk other = (Folk) otherObject;
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
