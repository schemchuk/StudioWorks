package de.telran.module1.practic._1129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassJenja {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,7));
        //System.out.println(mylist);
        List<Integer> vsa =  mylist.reversed();

        System.out.println(mylist.reversed());
    System.out.println(mylist);
        System.out.println(vsa);
        StringBuilder dfg = new StringBuilder("Vasja");
        dfg.append("Vasilissa");
        dfg.insert(5, ",");
        dfg.delete(4, 14);
        System.out.println(dfg);
        dfg.reverse();
        System.out.println(dfg);
        dfg.toString();
        String masa = dfg.toString();
        System.out.println(masa);
        dfg.deleteCharAt(4);
        System.out.println(dfg);


    }
}
