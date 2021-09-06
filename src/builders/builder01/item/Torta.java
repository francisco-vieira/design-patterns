package builders.builder01.item;

import builders.builder01.alimentos.Comida;

public class Torta extends Comida {

    @Override
    public String nome() {
        return "Torta";
    }

    @Override
    public Double preco() {
        return 5.40;
    }
}
