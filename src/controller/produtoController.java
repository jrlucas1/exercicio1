package controller;

import model.Produto;

import java.util.*;

public class produtoController {
    public static void main(String[] args) {
        //Produtos
        Produto produto1 = new Produto("1","Bola", "Bola de futebol", 3.5, 10);
        Produto produto2 = new Produto("2", "Copo", "Copo de vidro 250ML", 10, 30);
        Produto produto3 = new Produto("3","Lapis", "Copo de vidro 250ML", 10, 30);
        Produto produto4 = new Produto("4","Pote", "Pote para guardar comida", 10.5,32);
        Produto produto5 = new Produto("5", "Lapiseira", "Lapiseira 0.7", 4.5, 10);

        // Lista de produtos
        System.out.println("Fazendo uma objeto de tipo List de produtos...");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto5);

        System.out.println(produtos);

        // Pesquisando em uma lista

        System.out.println("\n\nPesquisando um objeto de id = 3 na lista produtos...");
        Produto produtosBusca = produtos.stream().filter(p-> p.getId().equals("3")).findAny().orElse(null);
        System.out.println(produtosBusca);

        //ordendando a lista em ordem decrescente
        System.out.println("\n\nOrdenando a lista em ordem decrescente");
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);



        // Map de produtos

        System.out.println("\n\n\n\nFazendo um Map de produtos");
        Map<String, Produto> produtosMap = new HashMap<>();

        produtosMap.put(produto1.getId(), produto1);
        produtosMap.put(produto2.getId(), produto2);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto3.getId(), produto3);
        produtosMap.put(produto4.getId(), produto4);
        produtosMap.put(produto5.getId(), produto5);

        System.out.println(produtosMap);
        // Pesquisando em um map
        System.out.println("\n\nPesquisando um objeto de id = 3 no map produtosMap");
        System.out.println(produtosMap.get(produto3.getId()));




    }
}
