package builders.builder01.item;

import builders.builder01.alimentos.Bebida;

public class Suco extends Bebida {
    @Override
    public String nome() {
        return "Suco";
    }

    @Override
    public Double preco() {
        return 3.35;
    }
}
