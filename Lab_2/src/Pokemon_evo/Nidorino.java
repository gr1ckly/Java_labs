package Pokemon_evo;
import Attacks.*;
import java.lang.*;
public class Nidorino extends NidoranM{
    public Nidorino(String name, int level){
        super(name, level);
        this.setStats(61.0, 72.0, 57.0, 55.0, 55.0, 65.0);
        this.addMove(new FuryAttack());
    }
}