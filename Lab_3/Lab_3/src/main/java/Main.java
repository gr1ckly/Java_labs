import classes.human.*;
import classes.SentenceMaker;
import classes.subjects.*;
import enums.Buildings;
import enums.Properties;

public class Main{
    public static void main(String[] args){
        var richman = new RichMans("Богачи");
        var richman1 = new RichMans("Богачи1");
        var richman2 = new RichMans("Богачи2");
        var worker = new Workers("Рабочие");
        var work = new Work("Работа");
        var capital = new Property("капиталы", Properties.CAPITAL);
        var plants = new Property("заводы", Properties.PLANTS);
        var factories = new Property("фабрики", Properties.FACTORIES);
        var finances = new Property("доходы", Properties.FINANCES);
        var lostPropertyRegister = new PropertyRegister("Регистр потерянного");
        var savedPropertyRegister = new PropertyRegister("Регистр сохраненного");
        var money = new Money("деньги");
        var folk = new Folk("народ");
        var storage = new Storage("общая касса");
        var theatres = new Building("большие театры", Buildings.LARGE_THEATRES);
        var museums = new Building("музеи", Buildings.MUSEUMS);
        var artGalleries = new Building("картинные галереи", Buildings.ART_GALLERIES);
        var stadiums = new Building("стадионы", Buildings.STADIUMS);
        var swimmingPools = new Building("плавательные бассейны", Buildings.SWIMMING_POOLS);
        var hospitals = new Building("больницы", Buildings.HOSPITALS);
        var pleasureSteambots = new Building("плавательные пароходики", Buildings.PLEASURE_STEAMBOTS);
        var sentenceMaker = new SentenceMaker();

        System.out.println(sentenceMaker.sentence1(richman, lostPropertyRegister, factories, finances));
        System.out.println(sentenceMaker.sentence2(richman, work));
        System.out.println(sentenceMaker.sentence3(richman, savedPropertyRegister, capital));
        System.out.println(sentenceMaker.sentence4(richman1, lostPropertyRegister, plants, factories));
        System.out.println(sentenceMaker.sentence5(richman1, savedPropertyRegister, capital));
        System.out.println(sentenceMaker.sentence6(worker, money, folk, richman2));
        System.out.println(sentenceMaker.sentence7(richman2));
        System.out.println(sentenceMaker.sentence8(worker, money, storage, theatres, museums, artGalleries, stadiums, swimmingPools, hospitals, pleasureSteambots));
    }
}