package strategies;

import strategies.behaviors.InterfaceStrategy;
import strategies.concrete.ConcreteStrategy1;
import strategies.concrete.ConcreteStrategy2;
import strategies.concrete.ConcreteStrategy3;

import java.text.DecimalFormat;

/**
 * Classe de contexto implementa o InterfaceStrategy
 */
public class ContextStrategy {

    private InterfaceStrategy strategy;
    private Double value;

    public ContextStrategy() {

        System.out.println("-------------------- Strategy ---------------------------");
        this.setStrategy(new ConcreteStrategy1(), 10.0);
        System.out.println(this.resultado());


        this.setStrategy(new ConcreteStrategy2(), 10.0);
        System.out.println(this.resultado());

        this.setStrategy(new ConcreteStrategy3(), 10.0);
        System.out.println(this.resultado());


    }

    public void setStrategy(InterfaceStrategy strategy, Double value) {
        this.strategy = strategy;
        this.value = value + this.strategy.AlgoritmoInterface(value);
    }

    public String resultado() {
        return DecimalFormat.getCurrencyInstance().format(value);
    }
}
