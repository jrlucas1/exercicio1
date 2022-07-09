package controller;

import model.Carro;
import model.Conta;
import model.Produto;
import model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Bola", "Bola de futebol", 3.5, 10);
        Produto produto2 = new Produto("Copo", "Copo de vidro 250ML", 10, 30);
        Produto produto3 = new Produto("Lapis", "Copo de vidro 250ML", 10, 30);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos);

    }
}
