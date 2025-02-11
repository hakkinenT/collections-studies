package com.example.streams;

import java.util.*;
import java.util.stream.IntStream;

public class StreamFlatMapToIntTest {
    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> i2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        List<Integer> i3 = new ArrayList<>(Arrays.asList(11,12,13,14,15));

        List<IntToFlat> intToFlats = new ArrayList<>(Arrays.asList(new IntToFlat(10, i1), new IntToFlat(20, i2), new IntToFlat(30, i3)));
        IntStream iStream = intToFlats
                                .stream()
                                .flatMapToInt(i -> i.getListOfData().stream().mapToInt(Integer::intValue));
        iStream.forEach(i -> System.out.print(i + " "));

        

    }
}

class IntToFlat{
    private Integer data;
    private List<Integer> listOfData;
    
    public IntToFlat() {
    }

    public IntToFlat(Integer data, List<Integer> listOfData) {
        this.data = data;
        this.listOfData = listOfData;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public List<Integer> getListOfData() {
        return listOfData;
    }

    public void setListOfData(List<Integer> listOfData) {
        this.listOfData = listOfData;
    }

    
}
