package main.enums;

public enum FinancialAssets {
    FINANCES("Доходы"), CAPITAL("капитал"), FACTORIES("Фабрики"), PLANTS("Заводы");

    private String russian;

    FinancialAssets(String russian){
        this.russian = russian;
    }

    @Override
    public String toString(){
        return this.russian;
    }
}
