package POO;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Rebeca";
        c1.itens.add(new Item("caneta", 20, 7.45));
        c1.itens.add(new Item("borracha", 12, 3.89));
        c1.itens.add(new Item("caderno", 3, 18.79));

        System.out.println(c1.itens.size());

        System.out.println("Valor total da compra é R$" + c1.getValorTotal());
    }
}
