package Pokemon_evo;
import Attacks.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;

public class Bouffalant extends Pokemon{
    public Bouffalant(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(95.0, 110.0, 95.0, 40.0, 95.0, 55.0);
        this.setMove(new FocusEnergy(), new SwordsDance(), new RockClimb(), new Leer());
    }
}
