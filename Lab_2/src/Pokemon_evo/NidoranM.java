package Pokemon_evo;
import Attacks.*;
import ru.ifmo.se.pokemon.*;
import java.lang.*;
public class NidoranM extends Pokemon{
    public NidoranM(String name, int level){
        super(name, level);
        this.setType(Type.POISON);
        this.setStats(46.0, 57.0, 40.0, 40.0, 40.0, 50.0);
        this.setMove(new Venoshock(), new Facade());
    }
}
