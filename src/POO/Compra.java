package POO;

import java.util.ArrayList;

public class Compra {

    String cliente; //deveria ser uma classe cliente
    ArrayList<Item> itens = new ArrayList<Item>();

    double getValorTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }


}
