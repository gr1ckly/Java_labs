package main.abstract_classes;

public abstract class Group {
    private String id = "Group";
    private static int count = 0;
    private String name;

    public Group(String name){
        this.name = name;
        this.id += Integer.toString(count);
        this.count += 1;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return id.hashCode();
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
}
