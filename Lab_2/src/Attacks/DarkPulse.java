package Attacks;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove{
    public DarkPulse(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected String describe(){
        return "двигается по-черному";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect();
        eff.chance(0.2);
        eff.flinch(p);
    }
}
