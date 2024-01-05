package enums;

public enum Properties {
    FINANCES("Доходы"), CAPITAL("капитал"), FACTORIES("Фабрики"), PLANTS("Заводы");

    private String russian;

    Properties(String russian){
        this.russian = russian;
    }

    @Override
    public String toString(){
        return this.russian;
    }
}
