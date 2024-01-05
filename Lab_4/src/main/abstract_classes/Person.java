package main.abstract_classes;

import main.exceptions.IncorrectAgeException;

public abstract class Person {
    private String id = "Person";
    private static int count = 0;
    protected String name;
    protected int age;
    public Person(String name){
        this.name = name;
        this.id += Integer.toString(count);
        this.count += 1;
    }

    public Person(String name, int age) throws IncorrectAgeException {
        this.name = name;
        this.id += Integer.toString(count);
        this.count += 1;
        if (age>=1){
            this.age = age;
        }
        else{
            throw new IncorrectAgeException("Неправильно введен возраст");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws IncorrectAgeException{
        if (age>=1){
            this.age = age;
        }
        else{
            throw new IncorrectAgeException("Неправильно введен возраст");
        }
    }

    public String talk(){
        return "говорить";
    }

    public abstract String walking();

    public String must(){
        return "должен";
    }

    public String doFor(){
        return "делать что-то для";
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){return true;}
        if (otherObject == null){return true;}
        if (getClass() != otherObject.getClass()) {return false;}
        else{
            return true;
        }
    }
}
