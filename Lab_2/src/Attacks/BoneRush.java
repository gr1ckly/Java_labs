package Attacks;
import ru.ifmo.se.pokemon.*;

public class BoneRush extends PhysicalMove{
    public BoneRush(){
        super(Type.GROUND, 25, 90);
    }

    @Override
    protected String describe(){
        return "бьет Костяном";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        int probably = (int)(Math.random()*8);
        switch (probably){
            case 0,1,2:
                p.setMod(Stat.ATTACK, +2);
                break;
            case 3, 4, 5:
                p.setMod(Stat.ATTACK, +4);
                break;
            case 6:
                p.setMod(Stat.ATTACK, +6);
                break;
            case 7:
                p.setMod(Stat.ATTACK, +8);
                break;
            default:
                break;
        }
    }
}
