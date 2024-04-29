package de.telran.javaPro.withGroup.egorovMichael.lesson_24_04_23.lambda.set;

import java.util.*;

public class SET1 {
    public static void main(String[] args) {
       Set<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();
        list.add("sraka");
        String s = list.get(0);

        ParamClass<String> paamString = new ParamClass<>("Str");
        ParamClass<Integer> paramInt = new ParamClass<>(3);

        System.out.println(paamString.getValue());


    }
}
 class ParamClass<T>{
    private T value;

     public ParamClass(T value) {
         this.value = value;
     }

     public T getValue() {
         return value;
     }

     @Override
     public String toString() {
         return "ParamClass{" +
                 "value=" + value +
                 '}';
     }

     public void setValue(T value) {
         this.value = value;
     }
 }