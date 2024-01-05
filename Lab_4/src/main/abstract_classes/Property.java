package main.abstract_classes;

public abstract class Property {
    protected String name;
    static private int count = 0;
    private String id = "Property";

    public Property(String name){
        this.name = name;
        this.id += Integer.toString(count);
        this.count +=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


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
    public int hashCode(){
        return id.hashCode();
    }
}
