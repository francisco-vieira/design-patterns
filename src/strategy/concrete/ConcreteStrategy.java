package strategy.concrete;

import strategy.behaviors.InterfaceStrategy;

/**
 * As classes concretas herdam a InterfaceStrategy tornando se uma classe de strategy
 */
public class ConcreteStrategy implements InterfaceStrategy {
    @Override
    public Double AlgoritmoInterface(Double value) {
        return value * 0.5;
    }
}
