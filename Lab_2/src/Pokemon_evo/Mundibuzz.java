package Pokemon_evo;
import Attacks.*;
import java.lang.*;
public class Mundibuzz extends Vullaby{
    public Mundibuzz(String name, int level){
        super(name, level);
        this.setStats(110.0, 65.0, 105.0, 55.0, 95.0, 80.0);
        this.addMove(new BoneRush());
    }
}