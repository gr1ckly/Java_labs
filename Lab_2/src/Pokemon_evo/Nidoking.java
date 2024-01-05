package Pokemon_evo;
import Attacks.Blizzard;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class Nidoking extends Nidorino{
    public Nidoking(String name, int level){
        super(name, level);
        this.addType(Type.GROUND);
        this.setStats(81.0, 102.0, 77.0, 85.0, 75.0, 85.0);
        this.addMove(new Blizzard());
    }
}
