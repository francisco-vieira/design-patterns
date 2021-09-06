package builders.builder01.ref;

import builders.builder01.item.*;

public class RefeicaoBuilder {

    public Refeicao prepararRef1() {
        Refeicao refeicao = new Refeicao();
        refeicao.setItem(new Hamburg());
        refeicao.setItem(new Refrigerante());
        return refeicao;
    }

    public Refeicao prepararRef2() {
        Refeicao refeicao = new Refeicao();
        refeicao.setItem(new Torta());
        refeicao.setItem(new Suco());
        refeicao.setItem(new Sorverte());
        return refeicao;
    }

}
