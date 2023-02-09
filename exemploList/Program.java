package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //INSERINDO ELEMENTOS
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Marco");
        list.add(2, "Adelino");//inserindo um elemento na posição 2

        //TAMANHO DA LISTA
        System.out.println(list.size());// verficando o tamanho da lista

        //usando foreach
        for (String x : list) {
            System.out.println(x);
        }

        //REMOVENDO ELEMENTO DA LISTA
        System.out.println("---------------------------");
        //list.remove(1);// removendo elemento por posição
        //list.remove("Anna");//removendo elemento pela nome
        list.removeIf(x -> x.charAt(0) == 'M');// removendo elemtento por predicado

        for (String x : list) {
            System.out.println(x);
        }

        //ENCONTRAR POSIÇÃO DE ELEMENTOS
        System.out.println("---------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // mostra a posição do elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // quando nao encontra o nome na
                                                                        // lista ele retorna com a elemento -1

        //FILTRAR NA LISTA COM BASE EM PREDICADO
        System.out.println("---------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //vai mostra todos os nomes que começa com a letra 'A'
        for (String x : result) {
            System.out.println(x);
        }

        //FILTRA ELEEMENTO DA LISTA COM BASE EM PREDICADO
        System.out.println("---------------------------");
        //Comando para encontrar o primeiro elemento
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
