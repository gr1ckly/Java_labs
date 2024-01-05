package Attacks;
import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "поднял свой боевой дух";
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
    }
}
