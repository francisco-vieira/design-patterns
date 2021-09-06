package builders.builder01.item;

import builders.builder01.alimentos.Bebida;

public class Refrigerante extends Bebida {
    @Override
    public String nome() {
        return "Refrigerante";
    }

    @Override
    public Double preco() {
        return 5.95;
    }
}
