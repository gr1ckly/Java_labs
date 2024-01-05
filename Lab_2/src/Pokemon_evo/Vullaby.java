package Pokemon_evo;
import Attacks.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Vullaby extends Pokemon{
    public Vullaby(String name, int level){
        super(name, level);
        this.setType(Type.DARK, Type.FLYING);
        this.setStats(70.0, 55.0, 75.0, 45.0, 65.0, 60.0);
        this.setMove(new Rest(), new DarkPulse(), new FuryAttack());
    }
}