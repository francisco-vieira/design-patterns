package builders.builder01.item;

import builders.builder01.alimentos.Comida;

public class Sorverte extends Comida {
    @Override
    public String nome() {
        return "Sorvete";
    }


    @Override
    public Double preco() {
        return 5.40;
    }
}
