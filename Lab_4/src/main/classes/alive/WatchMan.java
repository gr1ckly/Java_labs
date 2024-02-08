package main.classes.alive;

import main.classes.groups.WorkingClass;
import main.exceptions.IncorrectAgeException;
import main.interfaces.PermissionInteractive;

public class WatchMan extends Workman implements PermissionInteractive {
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