package main.classes.groups;

import main.abstract_classes.Group;
import main.abstract_classes.Person;
import main.exceptions.IncorrectAgeException;
import main.interfaces.ForcedAbility;
import main.interfaces.PermissionInteractive;
import main.interfaces.Thinkable;

import java.util.ArrayList;

public class WorkingClass extends Group {
    private ArrayList<Workman> workmans = new ArrayList<Workman>();

    public WorkingClass(String name){
        super(name);
    }

    public WorkingClass(String name, Workman... workmen){
        super(name);
        for (Workman workman:workmen){
            this.workmans.add(workman);
        }
    }

    public static class Workman extends Person implements Thinkable, ForcedAbility {
        public Workman(String name){
            super(name);
        }
        public Workman(String name, int age) throws IncorrectAgeException {
            super(name, age);
        }

        public String build(){
            return "построить";
        }

        @Override
        public String thinkable(){
            return "считать, что";
        }

        public String issuedAnOrder(){
            return "издать приказ";
        }

        public String toRun(){
            return "сбежать";
        }

        @Override
        public String walking(){
            return "подойти";
        }

        @Override
        public String forcedTo(){
            return "нуждаться";
        }

        public String exist(){
            return "есть";
        }

        @Override
        public boolean equals(Object otherObject){
            if (!super.equals(otherObject)) return false;
            WorkingClass.Workman other = (WorkingClass.Workman) otherObject;
            return this.getId().equals(other.getId()) && this.name.equals(other.getName()) && this.getAge()==other.getAge();
        }

        @Override
        public String toString(){
            return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", age=" + this.getAge() + "]";
        }
    }

    public static class WatchMan extends WorkingClass.Workman implements PermissionInteractive {
        public WatchMan(String name){
            super(name);
        }
        public WatchMan(String name, int age) throws IncorrectAgeException {
            super(name, age);
        }

        @Override
        public String permission(){
            return "разрешить";
        }
    }

    public ArrayList<Workman> getWorkmen() {
        return this.workmans;
    }

    public void setWorkmen(ArrayList<Workman> workmen) {
        this.workmans = workmen;
    }

    public void addWorkman(Workman workman){
        this.workmans.add(workman);
    }

    public void removeWorkman(Workman workman){
        this.workmans.remove(workman);
    }

    public void createAndAddWorkman(String name){
        Workman workman = new Workman(name);
        this.workmans.add(workman);
    }

    public void createAndAddWorkman(String name, int age){
        Workman workman = new Workman(name);
        try {
            workman.setAge(age);
        } catch (IncorrectAgeException e) {
            throw new RuntimeException(e);
        }
        this.workmans.add(workman);
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        WorkingClass other = (WorkingClass) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName()) && this.getWorkmen().equals(other.getWorkmen());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + ", workmen=" + this.getWorkmen().toString() + "]";
    }
}
