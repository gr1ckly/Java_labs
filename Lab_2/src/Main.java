import ru.ifmo.se.pokemon.*;
import Pokemon_evo.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Bouffalant p1 = new Bouffalant("Рогатое недоразумение", 1);
        Mundibuzz p2 = new Mundibuzz("Взрослый отброс", 1);
        Nidoking p3 = new Nidoking("Лютый чел на стероидах", 1);
        Nidorino p4 = new Nidorino("Чел побольше", 1);
        NidoranM p5 = new NidoranM("Маленький чел", 1);
        Vullaby p6 = new Vullaby("Малыш-отброс", 1);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p6);
        b.go();
    }
}