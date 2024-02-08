package main;

import  main.classes.alive.*;
import  main.classes.groups.*;
import main.classes.subjects.*;
import main.enums.*;
import main.exceptions.*;
import main.records.*;
import main.interfaces.*;
public class Main {
    public static void main(String[] args){
        var Scooperfiled = new Scooperfield("Скуперфильд");
        var Sproots = new Sproots("Спрутс");
        var bulka = new Bread("булка");
        var crumbs = bulka.new Crumbs("кусочки");
        var edge = new Location("берег пруда");
        var ducks = new Animals("Утки");
        var duck = new Duck("утка");
        ducks.addAnimal(duck);
        Scooperfiled.putOn("черный цилиндр");
        var area = new Location("площадка");
        var young_animal = new Bear("молодняк");
        var publics = new WorkingClass("Публика");
        var random_chel = new Workman("чел");
        var watchman = new WatchMan("Сторож");
        var fence = new Location("ограда");
        var bear = new Bear("хорошенький медвежонок");
        var home = new Location("дом");
        var city = new Location("город");
        var forest = new Location("лес");
        var river = new Location("река");
        var birds = new Animals("птички");
        var flowers = new FlowersClass("цветы");
        var flower = new Flower("цветок");
        flowers.addFlower(flower);
        var many_flowers = new FlowersClass("многие цветы");
        var blue_flowers = new FlowersClass("синие цветы");
        var red_flowers = new FlowersClass("красные цветы");
        var yellow_flowers = new FlowersClass("желтые цветы");
        var forget_me_nots = new FlowersClass("незабудки");
        var daisies = new FlowersClass("ромашки");
        var lilies_values = new FlowersClass("ландыши");
        var bells = new FlowersClass("колокольчики");
        var marigolds = new FlowersClass("ноготки");
        var violets = new FlowersClass("фиалочки");
        var dandelions = new FlowersClass("одуванчики");
        var cornflowers = new FlowersClass("васильки");
        var muskariki = new FlowersClass("мускарики");
        var pansies = new FlowersClass("анютины глазки");
        var many_richmen = new RichClass("Многие богачи");
        var one_of_many = new RichMan("Один из многих");
        many_richmen.addRichman(one_of_many);
        var factories = new Assets("фабрики", FinancialAssets.FACTORIES);
        var income = new Money("доходы", 10000000, Currencies.RUBLES);
        var plants = new Assets("заводы", FinancialAssets.PLANTS);
        var capital = new Money("капиталы", 10000000, Currencies.DOLLAR);
        var money = new Money("денежки", 10000000, Currencies.DOLLAR);
        var richmen = new RichClass("Богачи");
        var richman = new RichMan("богач");
        var workmen = new WorkingClass("Рабочие");
        var workman = new Workman("рабочий");
        workmen.addWorkman(workman);
        var folk = new WorkingClass("народ");
        var storage = new Storage("общая касса");
        var theatre = new Building("большие театры", Buildings.LARGE_THEATRES);
        var museum = new Building("музеи", Buildings.MUSEUMS);
        var gallery = new Building("картинные галереи", Buildings.ART_GALLERIES);
        var stadium = new Building("стадионы", Buildings.STADIUMS);
        var swimming_pool = new Building("плавательные бассейны", Buildings.SWIMMING_POOLS);
        var hospital = new Building("больницы", Buildings.HOSPITALS);
        var steambot = new Building("павательные пароходики", Buildings.PLEASURE_STEAMBOTS);
        var some_richmen = new RichClass("Некоторые богачи");
        var one_of_some = new RichMan("Один из некоторых");
        some_richmen.addRichman(one_of_some);
        var part_of_money = new Money("часть денег");
        var part_capital = new Money("половина капитала");
        var another = new WorkingClass("другие");
        var one_of_another = new Workman("один из других");
        var shorty = new Workman("Коротышка");
        var servants = new WorkingClass("Слуги");
        var one_of_servants = new Workman("один из слуг");
        servants.addWorkman(one_of_servants);
        var canteen = new Location("столовая");
        var chief = new Workman("главный повар");
        var saved_register = new Register("Регистр имеющегося");
        var lost_register = new Register("Регистр потерянного");

        System.out.println(sentenceActionWithObjectAndLocation(Scooperfiled.getName(), Scooperfiled.start() + " " + Scooperfiled.toThrow(), crumbs.getName() + " " + bulka.getName(), "на", edge.name()));
        System.out.println(sentenceActionOnLocation(ducks.getName(), duck.swim(), "к", edge.name()));
        System.out.println(sentenceActionWithObject(ducks.getName(), duck.start() + " " + duck.toEat(), crumbs.getName() + " " + bulka.getName()));
        System.out.println(sentenceAction(ducks.getName(), duck.getUsed()));
        System.out.println(sentenceActionWithObject(ducks.getName(), duck.start() + " " + duck.findOut(), Scooperfiled.getName()));
        System.out.println(sentenceActionWithObject(ducks.getName(), duck.seeAround(), Scooperfiled.getClothes()));
        System.out.println(sentenceAction(Scooperfiled.getName(), Scooperfiled.toBeTouched()));
        bulka.setName("полбулки");
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.toEat(), ducks.getName() + " " + bulka.getName()));
        System.out.println(sentenceAction(Scooperfiled.getName(), Scooperfiled.talk()));
        System.out.println(sentenceActionOnLocation(Scooperfiled.getName(), Scooperfiled.go(), "на", area.name() + " " + young_animal.getName()));
        Uncertainty some_public = new Uncertainty() {
            @Override
            public String AnyBody() {
                return "если немного";
            }
        };
        System.out.printf(sentenceAction(publics.getName() + " " + some_public.AnyBody(), random_chel.exist()));
        System.out.printf(sentenceActionWithObject(", " + Scooperfiled.getName(), Scooperfiled.permission(), "у " + watchman.getName()) + "\n");
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.want() + " " + Scooperfiled.pet(), young_animal.getName()));
        System.out.println(sentenceAction(watchman.getName(), watchman.permission()));
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.clinbOver(), fence.name()));
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.pet(), young_animal.getName()));
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.kissingGoodbye(), bear.getName()));
        System.out.println(sentenceActionOnLocation(Scooperfiled.happy(), Scooperfiled.go(), "в", home.name()));
        Uncertainty relax_day = new Uncertainty() {
            @Override
            public String AnyBody() {
                return "В дни отдыха ";
            }
        };
        System.out.println(sentenceActionOnLocation(relax_day.AnyBody() + Scooperfiled.getName(), Scooperfiled.meeting("кто-то из новых приятелей"), "за", city.name() + ": в " + forest.name() + " или на " + river.name()));
        System.out.println(sentenceAction(Scooperfiled.getName(), Scooperfiled.breath()));
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.toHear(), birds.getName()));
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.toSee(),flowers.getName()));
        Uncertainty with_time = new Uncertainty() {
            @Override
            public String AnyBody() {
                return "Со временем ";
            }
        };
        System.out.println(sentenceActionWithObject(with_time.AnyBody() + Scooperfiled.getName(), Scooperfiled.thinkable(), many_flowers.getName()));
        System.out.println(sentenceActionWithObject("Для " + Scooperfiled.getName() + " " + flowers.getName(), flower.exist(), "теперь не просто " + blue_flowers.getName() + " " + red_flowers.getName() + " " + yellow_flowers.getName()));
        System.out.println(sentenceActionWithObject("Для " + Scooperfiled.getName() + " " + flowers.getName(), flower.exist(), "теперь " + forget_me_nots.getName() + " " + daisies.getName() + " " + lilies_values.getName() + " " + bells.getName() + " " + marigolds.getName() + " " + violets.getName() + " " + dandelions.getName() + " " + cornflowers.getName() + " " + muskariki.getName() + " " + pansies.getName()));
        System.out.println(sentenceActionWithObject(Scooperfiled.getName(), Scooperfiled.start() + " " + Scooperfiled.calling(), flowers.getName()));
        System.out.println(sentenceAction(flowers.getName(), flower.beNative(Scooperfiled)));
        System.out.println(sentenceAction(Scooperfiled.getName(), Scooperfiled.toSee() + " " + flowers.getName() + " и " + Scooperfiled.joy()));
        try{
            lost_register.addOwner(many_richmen);
            lost_register.addOwner(richmen);
            lost_register.addOwner(storage);
            lost_register.addOwner(Sproots);
            saved_register.addOwner(many_richmen);
            saved_register.addOwner(richmen);
            saved_register.addOwner(storage);
            saved_register.addOwner(some_richmen);
            saved_register.addOwner(Sproots);
        }catch (ReEntryException e){
            System.err.println(e.getCause());
        }
        lost_register.addProperty(many_richmen, income);
        lost_register.addProperty(many_richmen, factories);
        System.out.println(sentenceActionWithObject(many_richmen.getName(), one_of_many.lost(), lost_register.getOwnersPropertyStr(many_richmen)));
        System.out.println(sentenceAction(many_richmen.getName(), one_of_many.forsed() + " " + one_of_many.toWork()));
        Uncertainty more = new Uncertainty() {
            @Override
            public String AnyBody() {
                return "это даже лучше, чем";
            }
        };
        System.out.println(sentenceAction(many_richmen.getName(), one_of_many.understanding()+ " " + more.AnyBody() + " " +  one_of_many.excited() + " " + capital.getName() + " " + one_of_many.thinkable() + " " + one_of_many.cheat() + " и " + one_of_many.defenderFromCheat()));
        lost_register.addProperty(richmen, plants);
        lost_register.addProperty(richmen, factories);
        saved_register.addProperty(richmen, capital);
        System.out.println(sentenceActionWithObject(richman.exist() + " " + richmen.getName(), "которые " + richman.lost(), lost_register.getOwnersPropertyStr(richmen)));
        System.out.println(sentenceActionWithObject(richmen.getName(), richman.saved(), saved_register.getOwnersPropertyStr(richmen)));
        System.out.printf(sentenceAction(workmen.getName(), workman.thinkable() + " "));
        System.out.printf(sentenceActionWithObject(money.getName(), money.rightBelong(), folk.getName() + "\n"));
        System.out.println(sentenceActionWithObject("Так как " + richmen.getName(), richman.illegalAcquire(), money.getName()));
        System.out.println(sentenceAction(richmen.getName(), richman.slavery()));
        System.out.printf(sentenceAction(workmen.getName(), workman.issuedAnOrder()));
        System.out.println(sentenceActionWithObject("", richman.pass(), money.getName() + " в " + storage.getName()));
        System.out.println(sentenceActionWithObject(workmen.getName(), workman.build(), theatre.getName() + " " + museum.getName() + " " + gallery.getName() + " " + stadium.getName() + " " + swimming_pool.getName() + " " + hospital.getName() + " " + steambot.getName()));
        System.out.println(sentenceActionWithObject(richmen.getName(), richman.forsed() + " " + richman.pass(), money.getName() + " в " + storage.getName()));
        saved_register.removeAllProperty(richmen);
        saved_register.addProperty(storage, money);
        saved_register.addProperty(richmen, part_of_money);
        System.out.println(sentenceActionWithObject(some_richmen.getName(), one_of_some.saved(), part_of_money.getName()));
        System.out.println(sentenceActionWithObject(Sproots.getName(), Sproots.exist(), "среди " + some_richmen.getName()));
        Uncertainty nobody = new Uncertainty() {
            @Override
            public String AnyBody() {
                return "Никто не знать";
            }
        };
        System.out.println(sentenceActionWithObject(nobody.AnyBody() + " сколько", money.exist(), money.getName() + " у " + Sproots.getName()));
        saved_register.addProperty(Sproots, part_of_money);
        lost_register.addProperty(Sproots, part_capital);
        System.out.println(sentenceActionWithObject(Sproots.getName(), Sproots.pass(), lost_register.getOwnersPropertyStr(Sproots)));
        System.out.println(sentenceActionWithObject(Sproots.getName(), Sproots.saved(), saved_register.getOwnersPropertyStr(Sproots)));
        System.out.println(sentenceAction(Sproots.getName(), Sproots.thinkable() + " " + Sproots.mayBe() + " не " + Sproots.toWork()));
        System.out.println(sentenceAction(Sproots.getName(), "не " + Sproots.mayBe() + " не " + Sproots.toWork() + " и " + Sproots.beHonest()));
        System.out.println(sentenceActionWithObject(shorty.getName(), one_of_another.forcedTo(), "в " + another.getName()));
        System.out.println(sentenceActionWithObject(shorty.getName(), shorty.must() + " " + shorty.doFor(), another.getName()));
        System.out.println(sentenceActionWithObject(Sproots.getName(), "не " + Sproots.want() + " " + Sproots.doFor(), another.getName()));
        System.out.println(sentenceAction(Sproots.getName(), "чтобы " + another.getName() + " " + one_of_another.doFor() + " " + Sproots.getName()));
        System.out.println(sentenceAction(Sproots.getName(), Sproots.needForEat()));
        System.out.println(sentenceActionWithObject(servants.getName(), one_of_servants.toRun(), "от " + Sproots.getName()));
        System.out.println(sentenceActionOnLocation(Sproots.getName(), Sproots.start() + " " + Sproots.toEat(), "в", canteen.name()));
        Uncertainty toEatHim = new Uncertainty() {
            @Override
            public String AnyBody() {
                return "сначала кормить";
            }
        };
        System.out.println(sentenceActionOnLocation(Sproots.getName(), toEatHim.AnyBody(), "в", canteen.name()));
        System.out.println(sentenceActionWithObject("В один день " + chief.getName(), chief.walking() + " к", Sproots.getName()));
        System.out.println(sentenceAction(chief.getName(), chief.talk()));
        System.out.println(sentenceActionWithObject(Sproots.getName(), Sproots.toConfess() + ", что " + Sproots.saved(), saved_register.getOwnersPropertyStr(Sproots)));
        System.out.println(sentenceAction(Sproots.getName(), Sproots.talk()));
    }
    public static String sentenceAction(String name, String action){
        return name + " " + action;
    }

    public static String sentenceActionOnLocation(String name, String action, String proposed, String location){
        return name + " " + action + " " + proposed+ " " + location;
    }

    public static String sentenceActionWithObject(String name, String action, String object){
        return name + " " + action + " " + object;
    }

    public static String sentenceActionWithObjectAndLocation(String name, String action, String object, String proposed, String location){
        return name + " " + action + " " + object + " " + proposed + " " + location;
    }
}
