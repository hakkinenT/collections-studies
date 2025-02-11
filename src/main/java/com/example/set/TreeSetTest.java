package com.example.set;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        System.out.println("Set original: " + set);

        System.out.println();
        System.out.println("Inserindo um elemento duplicado: apple");
        set.add("apple");
        System.out.println("Set após inserção de elemento duplicado: " + set);
        
        System.out.println();
        System.out.println("Usando addAll para adicionar elementos: kiwi, grape, apple");
        List<String> list = new ArrayList<>();
        list.add("kiwi");
        list.add("grape");
        list.add("apple");
        set.addAll(list);
        System.out.println("Set após inserção de elementos: " + set);

        System.out.println();
        System.out.println("Usando o método celling() para retornar o elemento banana");
        TreeSet<String> treeSet = (TreeSet<String>) set;
        String element = treeSet.ceiling("banana");
        System.out.println(element);
        System.out.println("Set após inserção de elementos: " + treeSet);

        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(10);
        treeSet2.add(20);
        treeSet2.add(30);
        treeSet2.add(40);

        System.out.println();
        System.out.println("Set original: " + treeSet2);
        System.out.println();
        System.out.println("Usando o método celling() para retornar um elemento maior ou igual a 25");
        int element2 = treeSet2.ceiling(25);
        System.out.println(element2);

        System.out.println();
        System.out.println("Comparador do TreeSet de inteiros: " + treeSet2.comparator());

        System.out.println();
        System.out.println("Usando o método descendingSet() para retornar um conjunto com os elementos em ordem decrescente");
        NavigableSet<Integer> descendingSet = treeSet2.descendingSet();
        System.out.println(descendingSet);

        System.out.println();
        System.out.println("O conjunto contém o elemento 20? " + treeSet2.contains(20));

        System.out.println();
        System.out.println("Retornando o primeiro elemento do conjunto: " + treeSet2.first());

        System.out.println();
        System.out.println("Usando o método floor() para retornar um elemento menor ou igual a 25");
        element2 = treeSet2.floor(25);
        System.out.println(element2);

        System.out.println();
        System.out.println("Retornando o último elemento do conjunto: " + treeSet2.last());

        System.out.println();
        System.out.println("Retorna um subconjunto de elementos menores que 30");
        SortedSet<Integer> headSet = treeSet2.headSet(30);
        System.out.println(headSet);

        System.out.println();
        System.out.println("Retorna um subconjunto de elementos menores que 30, incluindo o 30");
        headSet = treeSet2.headSet(30, true);
        System.out.println(headSet);

        System.out.println();
        System.out.println("Retorna o último elemento maior que 20");
        element2 = treeSet2.higher(20);
        System.out.println(element2);

        System.out.println();
        System.out.println("Retorna o último elemento menor que 20");
        element2 = treeSet2.lower(20);
        System.out.println(element2);

        System.out.println();
        System.out.println("Retorna e remove o primeiro elemento do conjunto: " + treeSet2.pollFirst());
        System.out.println("Conjunto após remoção do primeiro elemento: " + treeSet2);

        System.out.println();
        System.out.println("Retorna e remove o último elemento do conjunto: " + treeSet2.pollLast());
        System.out.println("Conjunto após remoção do último elemento: " + treeSet2);

        System.out.println();
        System.out.println("Removendo o elemento 20 do conjunto");
        treeSet2.remove(20);
        System.out.println("Conjunto após remoção do elemento 20: " + treeSet2);

        System.out.println();
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.add(10);
        treeSet3.add(20);
        treeSet3.add(30);
        treeSet3.add(40);
        treeSet3.add(50);
        treeSet3.add(60);
        treeSet3.add(70);
        treeSet3.add(80);
        treeSet3.add(90);
        System.out.println("Set original: " + treeSet3);
        
        System.out.println();
        System.out.println("Retorna um subconjunto de elementos entre 30 e 70");
        SortedSet<Integer> subSet = treeSet3.subSet(30, 70);
        System.out.println(subSet);

        System.out.println();
        System.out.println("Retorna um subconjunto de elementos entre 30 e 70, excluindo o 30 e incluindo o 70");
        subSet = treeSet3.subSet(30, false, 70, true);
        System.out.println(subSet);

        
        System.out.println();
        System.out.println("Retorna um subconjunto de elementos maiores ou igual a 50");
        SortedSet<Integer> tailSet = treeSet3.tailSet(50);
        System.out.println(tailSet);

        System.out.println();
        System.out.println("Retorna um subconjunto de elementos maiores que 50, incluindo o 50");
        tailSet = treeSet3.tailSet(50, true);
        System.out.println(tailSet);

        System.out.println();
        System.out.println(treeSet3.retainAll(descendingSet));
        System.out.println(treeSet3);

    }
}
