package enums;

public enum Buildings {
    LARGE_THEATRES("большие театры"), MUSEUMS("музеи"), ART_GALLERIES("Картинные галереи"), STADIUMS("стадионы"), SWIMMING_POOLS("Плавательные бассейны"), HOSPITALS("больницы"), PLEASURE_STEAMBOTS("плавательные пароходики");

    private String russian;

    Buildings(String russian){
        this.russian = russian;
    }

    @Override
    public String toString(){
        return this.russian;
    }
}
