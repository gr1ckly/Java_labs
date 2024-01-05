package classes.subjects;

import enums.Currencies;

public class Money {
    private static int count =0;
    private String id = "CSH";
    private String name;
    private int quantity;
    private Currencies typeOfCoin;
    public Money(String name){
        this.name = name;
        this.quantity = 100000000;
        this.typeOfCoin = Currencies.RUBLES;
        this.id += Integer.toString(count);
        count += 1;
    }
    private String statusTransaction;

    public Money(String name, int quantity, Currencies typeOfCoin){
        this.name=name;
        this.quantity = quantity;
        this.typeOfCoin = typeOfCoin;
        this.id += Integer.toString(count);
        count += 1;
    }

    public String getId() {
        return id;
    }

    public String getStatusTransaction() {
        return statusTransaction;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Currencies getTypeOfCoin(){
        return this.typeOfCoin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfCoin(Currencies typeOfCoin) {
        this.typeOfCoin = typeOfCoin;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String affilation(){
        return "принадлежат";
    }

    public void allCashToStorage(Storage storage){
        storage.addCash(quantity, typeOfCoin);
        this.quantity = 0;
        this.statusTransaction = "эти все сдать в " + storage.getName();
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Money other = (Money) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId()) && this.quantity == other.getQuantity() && this.typeOfCoin.equals(other.getTypeOfCoin());
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.id + ", quantity=" + Integer.toString(quantity) + ", typeOfCoin=" + typeOfCoin.toString() + "]";
    }
}
