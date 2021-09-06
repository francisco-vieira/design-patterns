package builders.builder01.impl;

public interface Item {
    String nome();

    Empacotamento embalagem();

    void embalagem(Empacotamento empacotamento);

    Double preco();
}
