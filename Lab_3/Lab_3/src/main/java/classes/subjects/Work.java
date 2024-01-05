package classes.subjects;

import enums.Currencies;

public class Work {
    private static int count=0;
    private String id = "W";
    private Currencies currency;
    private String name;
    private int salary;

    public Work(String name){
        this.name = name;
        this.salary = 0;
        this.currency = Currencies.RUBLES;
        this.id += Integer.toString(count);
        count += 1;
    }

    public Work(String name, int salary, Currencies currency){
        this.name = name;
        this.salary = salary;
        this.currency = currency;
        this.id += Integer.toString(count);
        count += 1;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()){return false;}
        Work other = (Work) otherObject;
        return this.name.equals(other.getName()) && this.id.equals(other.getId()) && this.salary == other.salary && this.currency.equals(other.currency);
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.name + ", id=" + this.id + ", salary=" + Integer.toString(salary) + ", currency=" + this.currency.toString() + "]";
    }
}