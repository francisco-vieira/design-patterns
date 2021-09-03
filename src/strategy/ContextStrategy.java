package strategy;

import strategy.behaviors.InterfaceStrategy;

import java.text.DecimalFormat;

/**
 * Classe de contexto implementa o InterfaceStrategy
 */
public class ContextStrategy {

    private InterfaceStrategy strategy;
    private Double value;

    public ContextStrategy() {
    }

    public void setStrategy(InterfaceStrategy strategy, Double value) {
        this.strategy = strategy;
        this.value = this.strategy.AlgoritmoInterface(value);
    }

    public String resultado() {
        return DecimalFormat.getCurrencyInstance().format(value);
    }
}
