package de.telran.hexlet.forCodevars;

public class Cata_03_01 {
    public static void main(String[] args) {
        String string = "Huylo, how are you?";
        int result = (int) getCount(string.toLowerCase()); // Преобразуем строку в нижний регистр для учета всех гласных
        System.out.println("Количество гласных в строке: " + result);

    }

    public static int getCount(String str) {
//        String vowels = "aeoiu";
//   //     int count = 0;
////        for (char ch : str.toCharArray()) {
////            if (vowels.indexOf(ch) != -1) {
////                count++;
////            }
////        }
////       return count;
//-----------------------------------------------------------
//        String vowels = "aeoiu";
//        return (int) str.chars()
//                .filter(ch -> vowels.indexOf(ch) != -1)
//                .count();
  //      ----------------------------------------------------------
        int vowelsCount = 0;
        String vowels = "aeiou";
        for (char ch : str.toCharArray()){
            vowelsCount += (vowels.indexOf(ch) != -1 )  ? 1 : 0;
        }
        return vowelsCount;
    }
}







