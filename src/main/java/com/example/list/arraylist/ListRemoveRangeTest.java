package com.example.list.arraylist;

import java.util.*;

public class ListRemoveRangeTest {
    public static void main(String[] args) {
        CustomArraList customArraList = new CustomArraList();
        customArraList.add(10);
        customArraList.add(11);
        customArraList.add(12);
        customArraList.add(13);
        customArraList.add(14);
        customArraList.add(15);
        customArraList.add(16);
        customArraList.add(17);
        customArraList.add(18);
        customArraList.add(19);
        customArraList.add(20);
        System.out.println("Lista original: " + customArraList);
        System.out.println();
        System.out.println("Lista depois de remover os elementos do indice 1 ao indice 3: ");
        customArraList.removeRangeList(1, 4);
        System.out.println(customArraList);
    }
}

class CustomArraList extends ArrayList<Integer>{
    public void removeRangeList(int fromIndex, int toIndex){
        removeRange(fromIndex, toIndex);
    }
}
