package builders.builder01.embalagem;

import builders.builder01.impl.Empacotamento;

public class Sacola implements Empacotamento {
    @Override
    public String pacote() {
        return "Sacola";
    }
}
