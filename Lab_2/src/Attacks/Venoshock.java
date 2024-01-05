package Attacks;
import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove{
    public Venoshock(){
        super(Type.POISON, 65, 100);
    }

    @Override
    protected String describe(){
        return "харкнул ядом";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect();
        eff.chance(0.5).poison(p);
        }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition()==Status.POISON){
            def.setMod(Stat.HP, (int) (Math.round(damage)*2));
        }
    }
    }
