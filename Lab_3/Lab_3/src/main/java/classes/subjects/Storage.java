package classes.subjects;

import enums.Currencies;

import java.util.ArrayList;

public class Storage {
    private static int count = 0;
    private String id="ST";
    private String name;
    private int countRubles = 0;
    private int countDollars = 0;
    private int countEuros = 0;
    private ArrayList<Building> buildings = new ArrayList<>();

    public Storage(String name){
        this.name = name;
        this.id += Integer.toString(count);
        count += 1;
    }

    public Storage(String name, int countRubles){
        this.name = name;
        this.countRubles = countRubles;
        this.id += Integer.toString(count);
        count += 1;
    }

    public Storage(String name, int countRubles, int countDollars){
        this.name = name;
        this.countRubles = countRubles;
        this.countDollars = countDollars;
        this.id += Integer.toString(count);
        count += 1;
    }

    public Storage(String name, int countRubles, int countDollars, int countEuros){
        this.name = name;
        this.countRubles = countRubles;
        this.countDollars = countDollars;
        this.countEuros = countEuros;
        this.id += Integer.toString(count);
        count += 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountRubles() {
        return countRubles;
    }

    public int getCountDollars() {
        return countDollars;
    }

    public int getCountEuros() {
        return countEuros;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public void setCountDollars(int countDollars) {
        this.countDollars = countDollars;
    }

    public void setCountEuros(int countEuros) {
        this.countEuros = countEuros;
    }

    public void setCountRubles(int countRubles) {
        this.countRubles = countRubles;
    }

    public String getName() {
        return name;
    }

    public void addCash(int cash, Currencies currency){
        switch (currency){
            case DOLLAR:
                this.countDollars += cash;
                break;
            case RUBLES:
                this.countRubles += cash;
                break;
            case EURO:
                this.countEuros += cash;
                break;
        }
    }

    public void buyBuilding(Building building){
        var cashType = building.getCurrency();
        switch (cashType){
            case DOLLAR:
                if (this.countDollars>=building.getPrice()){
                    this.buildings.add(building);
                    this.countDollars -= building.getPrice();
                }
                break;
            case RUBLES:
                if (this.countRubles>=building.getPrice()){
                    this.buildings.add(building);
                    this.countRubles -= building.getPrice();
                }
                break;
            case EURO:
                if (this.countEuros>=building.getPrice()){
                    this.buildings.add(building);
                    this.countEuros -= building.getPrice();
                }
                break;
        }
    }

    public String strBuild(){
        String strBuildings = "";
        for (Building building:buildings){
            strBuildings += building.getName() + " ";
        }
        return "построить на эти средства " + strBuildings;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Storage other = (Storage) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId()) && this.countEuros == other.countEuros && this.countRubles == other.countRubles && this.countDollars == other.countDollars && this.buildings.equals(other.buildings);
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.id + ", countRubles=" + Integer.toString(countRubles) + ", countDollars=" + Integer.toString(countDollars) + ", countEuros=" + Integer.toString(countEuros) + ", buildings=" + this.buildings.toString() + "]";
    }
}
