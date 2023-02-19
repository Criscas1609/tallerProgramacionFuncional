package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CollectionUtils {

    public static <T> List<T> fillArray (Supplier<T> list, Integer count){
        List<T>listData = new ArrayList<T>();
        for(int i=0; i<count; i++){
            listData.add(list.get());
        }
        return listData;
    }

    public static <T,R> List<R> TransformList (List<T> list, Function<T,R> transform) {
        List<R> listData = new ArrayList<>();
        for(T value: list){
            listData.add(transform.apply(value));
        }
        return listData;
    }
    public static <T>void printList (List<T> list) {
        for(T value: list){
            System.out.println("Valor: "+value);
        }
    }

    public static <T> List<T> filter (List<T> list,Predicate<T> filterNumbers){
        List<T> listData = new ArrayList<>();
        for (T value: list){
            if(filterNumbers.test(value)){
                listData.add(value);
            }
        }
        return listData;
    }
    public static <T> T reduceList (List<T> list, BinaryOperator<T> add){
        return list.stream().reduce(add).get();
    }

}
