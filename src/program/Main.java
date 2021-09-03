package program;

import strategy.ContextStrategy;
import strategy.concrete.ConcreteStrategy;

public class Main {

    public static void main(String[] args) {
        //padrão strategy
        ContextStrategy context = new ContextStrategy();
        context.setStrategy(new ConcreteStrategy(), 3.5);
        System.out.println(context.resultado());

    }
}
