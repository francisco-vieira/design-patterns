package builders.builder01;

import builders.builder01.ref.Refeicao;
import builders.builder01.ref.RefeicaoBuilder;

public class ContextoBuilder {

    public ContextoBuilder() {
        System.out.println("\n");
        System.out.println("----------------------- Builder ------------------------\n");
        RefeicaoBuilder builder = new RefeicaoBuilder();

        System.out.println("Pedido -------------- 01");
        Refeicao refeicao = builder.prepararRef1();
        refeicao.showItems();
        System.out.println("---------");
        System.out.println("Total: ".concat(refeicao.valorTtoal().toString()));
        System.out.println("\n");

        System.out.println("Pedido -------------- 02");
        Refeicao refeicao2 = builder.prepararRef2();
        refeicao2.showItems();
        System.out.println("---------");
        System.out.println("Total: ".concat(refeicao2.valorTtoal().toString()));
        System.out.println("\n");
    }
}
