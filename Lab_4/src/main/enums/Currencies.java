package main.enums;

public enum Currencies {
    DOLLAR("$"), EURO("€"), RUBLES("₽");

    private String symbol;

    Currencies(String symbol){
        this.symbol=symbol;
    }

    @Override
    public String toString(){
        return this.symbol;
    }
}
