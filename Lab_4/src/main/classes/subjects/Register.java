package main.classes.subjects;

import main.abstract_classes.Property;
import main.exceptions.ReEntryException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Register {
    private String name;
    static private int count=0;
    private String id = "Register";
    private HashMap<Object, ArrayList<Property>> register = new HashMap<Object, ArrayList<Property>>();

    public Register(){
        this.id += Integer.toString(count);
        this.count += 1;
    }

    public Register(String name){
        this.name = name;
        this.id += Integer.toString(count);
        this.count += 1;
    }

    public Register(String name, Object owner, Property... objects){
        this.name = name;
        this.id += Integer.toString(count);
        this.count += 1;
        ArrayList<Property> props = new ArrayList<Property>(Arrays.asList(objects));
        register.put(owner, props);
    }

    public String getId() {
        return id;
    }

    public HashMap<Object, ArrayList<Property>> getRegister() {
        return register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegister(HashMap<Object, ArrayList<Property>> register) {
        this.register = register;
    }

    public void addOwner(Object object) throws ReEntryException {
        if (!this.register.containsKey(object)){
        ArrayList<Property> props;
            props = new ArrayList<Property>();
            this.register.put(object, props);}
        else{
            throw new  ReEntryException("Такой пользователь уже существует в регистре");
        }
    }

    public void addProperty(Object owner, Property property){
        ArrayList<Property> props = this.register.get(owner);
        props.add(property);
        this.register.put(owner, props);
    }

    public ArrayList<Property> getOwnersProperty(Object owner){
        return this.register.get(owner);
    }

    public String getOwnersPropertyStr(Object owner){
        String properties = "";
        for (Property property:this.register.get(owner)){
            properties += property.getName() + " ";
        }
        return properties;
    }

    public void removeOwner(Object owner){
        this.register.remove(owner);
    }

    public void removeAllProperty(Object owner){
        ArrayList<Property> props = this.register.get(owner);
        props.clear();
        this.register.put(owner, props);
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Register other = (Register) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId()) && this.getRegister().equals(other.getRegister());
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.getId() + ", register=" + this.register.toString() + "]";
    }
}
