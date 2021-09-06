package builders.builder01.ref;

import builders.builder01.impl.Item;

import java.util.ArrayList;
import java.util.List;

public class Refeicao {
    private final List<Item> items;

    public Refeicao() {
        items = new ArrayList<>();
    }

    public void setItem(Item item) {
        this.items.add(item);
    }

    public Double valorTtoal() {
        return items.stream().reduce(0.0, (value, item)-> value + item.preco(), Double::sum);
    }

    public void showItems() {
        items.forEach(c -> {
            Integer id = items.indexOf(c) + 1;
            System.out.printf("Item %d:".concat(c.nome()).concat("\n"), id);
            System.out.println("Embalagem:".concat(c.embalagem().pacote()));
            System.out.println("Preço:".concat(c.preco().toString()));
        });
    }

}
