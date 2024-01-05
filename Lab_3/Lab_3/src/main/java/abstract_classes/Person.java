package abstract_classes;

public abstract class Person {
    protected String name;
    protected int number;
    public Person(String name){
        this.name = name;
    }

    public Person(String name, int number){
        this.name = name;
        this.number = number;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract String thinkable();

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()) {return false;}
        else{
            return true;
        }
    }

    @Override
    public String toString(){
        return getClass().toString() + "[name=" + this.name + "]";
    }
}
