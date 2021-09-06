package builders.builder01.ref;

import builders.builder01.alimentos.Bebida;
import builders.builder01.alimentos.Comida;
import builders.builder01.embalagem.Balde;
import builders.builder01.embalagem.Garrafa;
import builders.builder01.embalagem.Sacola;
import builders.builder01.item.*;

public class RefeicaoBuilder {

    public Refeicao prepararRef1() {
        Refeicao refeicao = new Refeicao();

        Comida comida = new Hamburg();
        comida.embalagem(new Sacola());
        refeicao.setItem(comida);

        Bebida bebida = new Refrigerante();
        bebida.embalagem(new Garrafa());
        refeicao.setItem(bebida);

        return refeicao;
    }

    public Refeicao prepararRef2() {
        Refeicao refeicao = new Refeicao();

        Comida comida = new Torta();
        comida.embalagem(new Sacola());
        refeicao.setItem(comida);

        Bebida bebida = new Suco();
        bebida.embalagem(new Garrafa());
        refeicao.setItem(bebida);

        bebida = new Refrigerante();
        bebida.embalagem(new Garrafa());
        refeicao.setItem(bebida);

        comida = new Sorverte();
        comida.embalagem(new Balde());
        refeicao.setItem(comida);

        return refeicao;
    }

}
