package main.classes.subjects;

import main.abstract_classes.Property;
import main.enums.Currencies;
import main.enums.FinancialAssets;

public class Assets extends Property {
    private int cost;
    private Currencies currency;
    private FinancialAssets type;

    public Assets(String name, FinancialAssets type){
        super(name);
        this.type = type;
    }

    public Assets(String name, FinancialAssets type, int cost, Currencies currency){
        super(name);
        this.type =type;
        this.cost = cost;
        this.currency = currency;
    }

    public FinancialAssets getType() {
        return type;
    }

    public void setType(FinancialAssets type) {
        this.type = type;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public int getCost() {
        return cost;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Assets other = (Assets) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.getCost()==other.getCost() && this.getCurrency().equals(other.getCurrency()) && this.getType().equals(other.getType());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", type=" + this.getType().toString() + ", cost=" + this.getCost() + ", currency=" + this.getCurrency().toString() + "]";
    }
}
