package controller;
import model.Funcionario;

import java.util.*;

public class funcionarioController{
    public static void main(String[] args) {


    //Funcionarios
    Funcionario funcionario1 = new Funcionario("1","João da Silva", 1250);
    Funcionario funcionario2 = new Funcionario("2","Paulo de Almeida", 1000);
    Funcionario funcionario3 = new Funcionario("3","Carlos Alcantra Bragança", 1400);
    Funcionario funcionario4 = new Funcionario();
            funcionario4.setId("4");
            funcionario4.setNome("Fernanda Azevedo");
            funcionario4.setSalario(1500);
    Funcionario funcionario5 = new Funcionario("5", "Patricia Louro", 1350);


    // Lista de funcionários
        System.out.println("Fazendo uma lista de funcionários...");

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);

        System.out.println(funcionarios);

    // Pesquisa na lista de funcionarios
        System.out.println("\nPesquisando o funcionario de id 3 na lista de funcionarios...");
        Funcionario funcionarioBusca = funcionarios.stream().filter(f -> f.getId().equals("3")).findAny().orElse(null);
        System.out.println(funcionarioBusca);

    // Printando a lista em ordem descrente
        System.out.println("\n\nPrintando a lista em ordem decrescente");
        funcionarios.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarios);

    // Map de funcionarios
        System.out.println("\n\n\n\nFazendo um mapa de funcionarios");
    Map<String, Funcionario> funcionariosMap = new HashMap<>();

        funcionariosMap.put(funcionario1.getId(), funcionario1);
        funcionariosMap.put(funcionario2.getId(), funcionario2);
        funcionariosMap.put(funcionario3.getId(), funcionario3);
        funcionariosMap.put(funcionario4.getId(), funcionario4);
        funcionariosMap.put(funcionario4.getId(), funcionario4);
        funcionariosMap.put((funcionario5.getId()), funcionario5);

        System.out.println(funcionariosMap);


    // Pesquisa dos funcionarios no Map

        System.out.println("\n\nPesquisando o funcionario de id 3 no map de funcionarios");
        System.out.println(funcionariosMap.get(funcionario3.getId()));
}

}