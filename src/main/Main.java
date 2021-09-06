package main;

import builders.builder01.ContextoBuilder;
import observers.obs1.ContextObserver;
import strategies.ContextStrategy;

public class Main {

    public static void main(String[] args) {

        //padrão strategy
        new ContextStrategy();

        //padrão Observer
        new ContextObserver();

        //padrão builder
        new ContextoBuilder();

    }
}
