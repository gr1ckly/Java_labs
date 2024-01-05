package main.classes.subjects;

import main.enums.Currencies;
import main.interfaces.DisposalOfProperty;

public class Storage implements DisposalOfProperty {
    private static int count = 0;
    private String id = "Storage";
    private String name;
    private int countRubles;
    private int countDollar;
    private int countEuros;

    public Storage(String name){
        this.name = name;
        this.id += Integer.toString(count);
        this.count += 1;
    }

    public Storage(String name, int countRubles, int countDollar, int countEuros){
        this.name = name;
        this.countDollar = countDollar;
        this.countEuros = countDollar;
        this.countEuros = countEuros;
        this.id += Integer.toString(count);
        this.count += 1;
    }

    public String getName() {
        return name;
    }

    public int getCountEuros() {
        return countEuros;
    }

    public String getId() {
        return id;
    }

    public int getCountDollar() {
        return countDollar;
    }

    public int getCountRubles() {
        return countRubles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(Currencies currency, int count){
        switch (currency){
            case DOLLAR:
                this.countDollar += count;
                break;
            case RUBLES:
                this.countRubles += count;
                break;
            case EURO:
                this.countEuros += count;
                break;
        }
    }

    @Override
    public String saved(){
        return "приобрести";
    }

    @Override
    public String lost(){
        return "продать";
    }

    @Override
    public String illegalAcquire(){
        return "провести незаконную сделку";
    }

    @Override
    public String giveAway(){
        return "пожертвовать";
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Storage other = (Storage) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId()) && this.countEuros == other.countEuros && this.countRubles == other.countRubles && this.countDollar == other.countDollar;
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.getId() + ", countEuros=" + this.getCountEuros() + ", countRubles=" + this.getCountRubles() + ", countDollar=" + this.getCountDollar() + "]";
    }
}
