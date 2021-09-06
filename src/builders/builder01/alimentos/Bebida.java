package builders.builder01.alimentos;

import builders.builder01.embalagem.Garrafa;
import builders.builder01.impl.Empacotamento;
import builders.builder01.impl.Item;

public abstract class Bebida implements Item {

    @Override
    public Empacotamento embalagem() {
        return new Garrafa();
    }

    @Override
    public abstract Double preco();
}
