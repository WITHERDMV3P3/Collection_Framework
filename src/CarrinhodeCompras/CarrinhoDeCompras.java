package CarrinhodeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco,quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itempararemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itempararemover.add(i);
                }
            }
            itemList.removeAll(itempararemover);
        }else{
            System.out.println("a lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valortotal = 0d;
        if(!itemList.isEmpty()){
            for (Item i: itemList) {
                double valoritem = i.getPreco() * i.getQuantidade();
                valortotal += valoritem;
            }
        }else {
            System.out.println("a lista está vazia");
        }
        return valortotal;
    }

    public void exibiritens(){
        if(!itemList.isEmpty()){
        System.out.println(this.itemList);}
        else{
            System.out.println("a lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lapis",7.99,5);

        carrinhoDeCompras.exibiritens();

        carrinhoDeCompras.removerItem("Lapis");

        carrinhoDeCompras.exibiritens();

    }
}
