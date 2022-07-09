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

        Funcionario funcionario1 = new Funcionario("João da Silva", 1250);
        Funcionario funcionario2 = new Funcionario("Paulo de Almeida", 1000);
        Funcionario funcionario3 = new Funcionario("Carlos Alcantra Bragança", 1400);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);



        System.out.println(funcionarios);
    }
}
