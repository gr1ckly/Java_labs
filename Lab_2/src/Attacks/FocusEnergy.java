package Attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class FocusEnergy extends StatusMove{
    public FocusEnergy(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "фокусируется";
    }


    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, +2);
    }
}
