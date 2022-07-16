package controller;
import model.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class carroController {
    public static void main(String[] args) {

        Carro carro1 = new Carro("1", "Chevrolet", "Onix", 2020);
        Carro carro2 = new Carro ("2", "Fiat", "Uno", 2018);
        Carro carro3 = new Carro("3", "Jeep", "Cherokee", 2019);
        Carro carro4 = new Carro("4", "Toyota", "Corolla", 2022);
        Carro carro5 = new Carro("5", "Toyota", "Etios", 2016);

        // Fazendo uma lista de carros;
        System.out.println("Fazendo uma lista de carros");
        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        System.out.println(carros);

        //Pesquisando na lista de carros
        System.out.println("\n\nPesquisando carro de id 3 na lista");
        Carro carrosBusca = carros.stream().filter(c->c.getId().equals("3")).findAny().orElse(null);
        System.out.println(carrosBusca);

        // Fazendo um map de carros
        System.out.println("\n\nFazendo um map de carros");
        Map<String, Carro> carrosMap = new HashMap<>();

        carrosMap.put(carro1.getId(), carro1);
        carrosMap.put(carro2.getId(), carro2);
        carrosMap.put(carro3.getId(), carro3);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro4.getId(), carro4);
        carrosMap.put(carro5.getId(), carro5);

        System.out.println(carrosMap);

        // Pesquisando no map de carros
        System.out.println("\n\nPesquisando o carro de id 3 nesse mapa de carros");
        System.out.println(carrosMap.get(carro3.getId()));

    }
}
