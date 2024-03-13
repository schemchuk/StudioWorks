package de.telran.stanislavsPacage.lesson4.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arrayForSearch = {8,3,5,2,1,4,7,5,6,9};
        int elementForSearch = 5;

        int indexSearchElement = SearchIUtils.linearSearch(arrayForSearch,elementForSearch,true);

        if (indexSearchElement >=0) {
            System.out.println("Search element " + elementForSearch + " in the our array has first index " + indexSearchElement);
        } else {
            System.out.println("Search element " + elementForSearch + " didn't find in the our array.");
        }


     indexSearchElement = SearchIUtils.linearSearch(arrayForSearch,elementForSearch,false);

        if (indexSearchElement >=0) {
        System.out.println("Search element " + elementForSearch + " in the our array has last index " + indexSearchElement);
    } else {
        System.out.println("Search element " + elementForSearch + " didn't find in the our array.");
    }
}



}
