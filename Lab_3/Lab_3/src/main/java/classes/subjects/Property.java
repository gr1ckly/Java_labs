package classes.subjects;
import enums.Properties;

public class Property {
    private static int count = 0;
    private String id = "Prop";
    private String name;
    private Properties type;
    public Property(String name, Properties type){
        this.name = name;
        this.type = type;
        this.id += Integer.toString(count);
        count += 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public Properties getTypeOfProperties(){
        return this.type;
    }

    public void setName(){
        this.name = name;
    }

    public void setTypeOfProperties(Properties type){
        this.type = type;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Property other = (Property) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId()) && this.type.equals(other.getTypeOfProperties());
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.id + ", type=" + this.type.toString() + "]";
    }
}
