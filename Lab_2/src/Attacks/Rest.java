package Attacks;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{

    public Rest(){
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    protected String describe(){
        return "спит и лечится";
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, -6);
        Effect eff = new Effect();
        eff.sleep(p);
        eff.turns(2);
    }
}
