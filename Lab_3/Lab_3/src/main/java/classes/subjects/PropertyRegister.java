package classes.subjects;
import abstract_classes.Person;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class PropertyRegister {
    private static int count = 0;
    private String id ="PR";
    private String name;
    private HashMap<Person, ArrayList<Property>> PropertyRegisterHashMap = new HashMap<Person, ArrayList<Property>>();

    public PropertyRegister(String name){
        this.name = name;
        this.id += Integer.toString(count);
        count += 1;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setGroupProperty(Person group, Property... properties){
        var lst_properties = new ArrayList<Property>(Arrays.asList(properties));
        this.PropertyRegisterHashMap.put(group, lst_properties);
    }

    public String getGroupProperty(Person group){
        String properties = "";
        for (Property property:this.PropertyRegisterHashMap.get(group)){
            properties += " " + property.getName();
        }
        return properties;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        PropertyRegister other = (PropertyRegister) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId());
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.id + ", PropertyRegisterHashMap=" + this.PropertyRegisterHashMap.toString() + "]";
    }
}
