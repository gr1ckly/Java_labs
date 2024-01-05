package main.classes.subjects;

import main.abstract_classes.Property;

public class Bread extends Property {
    private String name;

    public Bread(String name){
        super(name);
    }

    public class Crumbs{
        private String cr_name;
        public Crumbs(String cr_name){
            this.cr_name = cr_name;
        }

        public String getName() {
            return cr_name;
        }
    }

    public String half(){
        return "половина " + this.name;
    }

    public String remains(){
        return "остатки " + this.name;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Bread other = (Bread) otherObject;
        return this.getId().equals(other.getId()) && this.getName().equals(other.getName());
    }

    @Override
    public String toString(){
        return getClass().toString()+"[name=" + this.getName() + ", id=" + this.getId() + "]";
    }
}
