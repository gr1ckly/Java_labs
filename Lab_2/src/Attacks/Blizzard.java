package Attacks;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove{
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override
    protected String describe(){
        return "морозит";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect();
        eff.chance(0.1).freeze(p);
    }
}
