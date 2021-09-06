package strategies.concrete;

import strategies.behaviors.InterfaceStrategy;

/**
 * As classes concretas herdam a InterfaceStrategy tornando se uma classe de strategy
 */
public class ConcreteStrategy2 implements InterfaceStrategy {
    @Override
    public Double AlgoritmoInterface(Double value) {
        return value * 0.15;
    }
}
