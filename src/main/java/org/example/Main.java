package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Punto 1
        List<Integer> firstList = new ArrayList<Integer>(CollectionUtils.fillArray(()->new Random().nextInt(10),10));
        List<String>  firstListString=new ArrayList<>(CollectionUtils.fillArray(()->new Random().toString(),10));
        //Punto 2
        List<Integer> secondList = new ArrayList<Integer>(CollectionUtils.TransformList(firstList,value->value*value));
        //Punto 3
        CollectionUtils.printList(firstList);
        //Punto 4
        List<Integer> thirdListString=new ArrayList<>(CollectionUtils.filter(secondList,value->value>10));
        //Punto 5
        Integer total = CollectionUtils.reduceList(firstList,(number1,number2)->number1+number2);
    }
}