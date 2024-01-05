package classes;
import classes.human.*;
import classes.subjects.*;

public class SentenceMaker {
    public SentenceMaker(){}

    public String Many(String noun){
        return "Многие " + noun;
    }

    public String This(String noun){
        return "Этот " + noun;
    }

    public String Bettering(){
        return "лучше, чем";
    }

    public String Which(){
        return ",который";
    }

    public String Because(){
        return "так как";
    }

    public String sentence1(RichMans rich, PropertyRegister loseRegister, Property... properties){
        loseRegister.setGroupProperty(rich, properties);
        return Many(rich.getName()) + " " + rich.lose() + loseRegister.getGroupProperty(rich) + '.';
    }

    public String sentence2(RichMans rich, Work work){
        return This(rich.getName()) + " " + rich.forcedToWork() + " " + work.getName() + '.';
    }

    public String sentence3(RichMans rich, PropertyRegister savedRegister, Property... properties){
        savedRegister.setGroupProperty(rich, properties);
        return This(rich.getName()) + " " + rich.understanding() + " " + This(Bettering()) + " " + rich.excited() + savedRegister.getGroupProperty(rich) + " и " + rich.thinkable() + " " + rich.cheat() + " и " + rich.defenderFromCheat() + '.';
    }

    public String sentence4(RichMans rich, PropertyRegister lostRegister, Property... properties){
        lostRegister.setGroupProperty(rich, properties);
        return rich.getName() + " " + rich.exist() + " " + Which() + " " + rich.lose() + " " + lostRegister.getGroupProperty(rich) + '.';
    }

    public String sentence5(RichMans rich, PropertyRegister savedRegister, Property... properties){
        savedRegister.setGroupProperty(rich, properties);
        return This(rich.getName()) + " " + rich.saved() + savedRegister.getGroupProperty(rich) + ".";
    }

    public String sentence6(Workers workers, Money money, Folk folk, RichMans rich){
        return workers.getName() + " " + workers.thinkable() + " " + money.getName() +  " " + money.affilation() + " " + folk.getName() + ", " + Because() + " " + rich.getName() + " " + rich.illegalAcquire() + ".";
    }

    public String sentence7(RichMans rich){
        return This(rich.getName()) + " " + rich.force() + ".";
    }

    public String sentence8(Workers workers, Money money, Storage storage, Building... buildings){
        money.allCashToStorage(storage);
        for (Building building:buildings){
            storage.buyBuilding(building);
        }
        return workers.getName() + " " + workers.issuedAnOrder() + " " + money.getName() + " " + money.getStatusTransaction() + " и " + storage.strBuild() + ".";
    }
}
