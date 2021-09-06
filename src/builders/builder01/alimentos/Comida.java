package builders.builder01.alimentos;

import builders.builder01.embalagem.Balde;
import builders.builder01.impl.Empacotamento;
import builders.builder01.impl.Item;

public abstract class Comida implements Item {

    @Override
    public Empacotamento embalagem() {
        return new Balde();
    }

    @Override
    public abstract Double preco();
}
