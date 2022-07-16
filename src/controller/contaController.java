package controller;

import model.Conta;

import java.util.*;

public class contaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1", 300);
        Conta conta2 = new Conta("2", 400);
        Conta conta3 = new Conta("3", 353.30);
        Conta conta4 = new Conta("4", 3982.40);
        Conta conta5 = new Conta("5", 3032.33);

        //Fazendo a lista de contas
        System.out.println("Fazendo uma lista de contas...");
        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        System.out.println(contas);


        // Pesquisar na lista

        System.out.println("\n\nPesquisando a conta de id 3 na lista...");
        Conta contasBusca = contas.stream().filter(c->c.getId().equals("3")).findAny().orElse(null);
        System.out.println(contasBusca);

        //Printando lista e map em ordem descrescente;
        System.out.println("\n\nPrintando a lista em ordem decrescente");
        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas);



        //Fazendo um mapa de contas
        System.out.println("\n\n\n\nFazendo um map de contas...");

        Map <String, Conta> contasMap = new HashMap<>();

        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta4.getId(), conta5);

        System.out.println(contasMap);

        //Pesquisando conta de id 3 no Map
        System.out.println("\n\nPesquisando conta de id 3 no Map");
        System.out.println(contasMap.get(conta3.getId()));

    }
}
