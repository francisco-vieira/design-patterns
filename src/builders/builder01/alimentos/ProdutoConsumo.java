package builders.builder01.alimentos;

import builders.builder01.impl.Empacotamento;
import builders.builder01.impl.Item;

public abstract class ProdutoConsumo implements Item {

    protected Empacotamento empacotamento;

    @Override
    public Empacotamento embalagem() {
        return empacotamento;
    }

    @Override
    public void embalagem(Empacotamento empacotamento) {
        this.empacotamento = empacotamento;
    }

}
