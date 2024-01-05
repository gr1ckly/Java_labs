package main.classes.subjects;

import main.abstract_classes.Property;
import main.enums.Currencies;

public class Money extends Property {
    private int quantity;
    private Currencies currency;

    public Money(String name){
        super(name);
    }

    public Money(String name, int quantity, Currencies currency){
        super(name);
        this.currency = currency;
        this.quantity = quantity;
    }

    public String rightBelong(){
        return "по праву принадлежать";
    }

    public String exist(){
        return "есть";
    }

    public int getQuantity() {
        return quantity;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Money other = (Money) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.getCurrency().equals(other.getCurrency()) && this.getQuantity()==other.getQuantity();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", quantity=" + this.getQuantity() + ", currency=" + this.getCurrency().toString() + "]";
    }
}
