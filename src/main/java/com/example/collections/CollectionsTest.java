package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shoes");
        list.add("Toys");

        //! ADICIONA TODOS OS ELEMENTOS ESPECIFICADOS A LISTA
        Collections.addAll(list, "Fruits", "Bat", "Ball");
        for (String string : list) {
            System.out.print(string);
            System.out.print(" ");

        }

        //! SUBSTITUI TODOS OS VALORES DA LISTA PELO VALOR 100
        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        System.out.println();
        System.out.println(listInt);

        Collections.fill(listInt, 100);
        
        System.out.println();
        System.out.println(listInt);

        //! ORDENA UMA LISTA
        Collections.sort(list);
        System.out.println(list);
        //! ORDENA UMA LISTA DE FORMA INVERSA
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //! REALIZA A BUSCA BINÁRIA EM UMA LISTA
        List<Integer> listSort = new ArrayList<>();
        listSort.add(30);
        listSort.add(100);
        listSort.add(-1);
        listSort.add(50);
        listSort.add(28);
        listSort.add(11);

        Collections.sort(listSort);
        System.out.println(Collections.binarySearch(listSort, 30));
        System.out.println(Collections.binarySearch(listSort, -2));

        //! COPIA O CONTEÚDO DE UMA LISTA PARA OUTRA
        List<Integer> listTarget = new ArrayList<>();
        listTarget.add(10);
        listTarget.add(15);
        listTarget.add(20);
        listTarget.add(30);

        List<Integer> listSource = new ArrayList<>();
        listSource.add(50);

        Collections.copy(listTarget, listSource);
        System.out.println(listTarget);

        //! Verifica se os conjuntos não tem elementos em comum
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Os dois cojuntos não possuem elementos em comum? " + Collections.disjoint(set1, set2));
        
        //! USO DE OUTROS MÉTODOS
        List<Integer> list2 = new ArrayList<>(List.of(1, 2,3,4,5,6,7,8,9,10));
        System.out.println("Lista original: " + list2);
        Collections.shuffle(list2);
        System.out.println("Suffled list: " + list2);

        Collections.rotate(list2, 3);
        System.out.println("List rotated: " + list2);

        List<Integer> list3 = new ArrayList<>(List.of(1, 2,3,4,5,6, 8, 9, 15, 16, 17));
        list3.retainAll(list2);
        System.out.println("Mantem os elementos que estão na list2 " + list3);


    }
}
