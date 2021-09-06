package builders.builder01.embalagem;

import builders.builder01.impl.Empacotamento;

public class Balde implements Empacotamento {
    @Override
    public String pacote() {
        return "Balde";
    }
}
