package Attacks;
import ru.ifmo.se.pokemon.*;
public class RockClimb extends PhysicalMove{
    public RockClimb(){
        super(Type.NORMAL, 90.0, 85.0);
    }

    @Override
    protected String describe(){
        return "атакует";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect();
        eff.chance(0.2);
        eff.confuse(p);
    }
}
