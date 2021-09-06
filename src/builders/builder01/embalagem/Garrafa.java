package builders.builder01.embalagem;

import builders.builder01.impl.Empacotamento;

public class Garrafa implements Empacotamento {
    @Override
    public String pacote() {
        return "Garrafa";
    }
}
