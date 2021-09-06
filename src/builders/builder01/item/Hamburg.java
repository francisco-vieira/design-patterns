package builders.builder01.item;

import builders.builder01.alimentos.Comida;

public class Hamburg extends Comida {
    @Override
    public String nome() {
        return "Hamburg";
    }

    @Override
    public Double preco() {
        return 10.60;
    }
}
