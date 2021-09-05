package program;

import strategy.ContextStrategy;
import strategy.concrete.ConcreteStrategy1;
import strategy.concrete.ConcreteStrategy2;
import strategy.concrete.ConcreteStrategy3;

public class Main {

    public static void main(String[] args) {

        //padrão strategy
        ContextStrategy context = new ContextStrategy();

        context.setStrategy(new ConcreteStrategy1(), 10.0);
        System.out.println(context.resultado());


        context.setStrategy(new ConcreteStrategy2(), 10.0);
        System.out.println(context.resultado());

        context.setStrategy(new ConcreteStrategy3(), 10.0);
        System.out.println(context.resultado());

    }
}
