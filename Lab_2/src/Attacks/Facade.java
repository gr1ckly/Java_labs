package Attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70,100);
    }

    @Override
    protected String describe(){
        return "не боится";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition()== Status.BURN|p.getCondition()== Status.PARALYZE|p.getCondition()== Status.POISON){
            p.setMod(Stat.ATTACK, +2);
        }
    }
}
