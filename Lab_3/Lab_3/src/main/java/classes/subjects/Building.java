package classes.subjects;

import enums.Buildings;
import enums.Currencies;

public class Building {
    private String name;
    private int price;
    private Currencies currency;
    private Buildings buildingType;
    private static int count =0;
    private String id ="BD";
    public Building(String name, Buildings type){
        this.name = name;
        this.price = 0;
        this.currency = Currencies.RUBLES;
        this.buildingType = type;
        this.id += Integer.toString(count);
        count += 1;
    }
    public Building(String name, int price, Currencies currency){
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.id += Integer.toString(count);
        count += 1;
    }

    public Buildings getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Buildings buildingType) {
        this.buildingType = buildingType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Building other = (Building) otherObject;
        return this.name.equals(other.getName()) && this.price == other.getPrice() && this.currency.equals(other.currency) && this.id.equals(other.getId()) && this.buildingType.equals(other.getBuildingType());
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.id + ", currency=" + currency.toString() + ", price=" + Integer.toString(this.price) + ", buildingType=" + buildingType.toString() + "]";
    }
}
