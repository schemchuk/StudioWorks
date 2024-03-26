package de.telran.javaPro.lections.lesson_24_03_25;

import java.util.EnumSet;

public class SetsWithEnums {

   public enum Color{
      RED, GREEN,WHITE, BLACK;
    }
    public static void main(String[] args) {
       EnumSet<Color> colorSet =  EnumSet.noneOf(Color.class);
       colorSet.add(Color.RED);
       colorSet.add(Color.BLACK);
       colorSet.add(Color.WHITE);

       if (colorSet.contains(Color.WHITE)){
           System.out.println("Yes");
       }
    }
}
