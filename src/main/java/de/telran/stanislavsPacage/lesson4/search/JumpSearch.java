package de.telran.stanislavsPacage.lesson4.search;

public class JumpSearch {

    public static void main(String[] args) {

        int[] array = {3,22,47,57,67,89,91,95,99};
        int elementForSearch = 67;

        int searchJumpIndex = SearchIUtils.jumpSearch(array,elementForSearch);

        if (searchJumpIndex >=0) {
            System.out.println("Search element " + elementForSearch + " in the our array has first index " + searchJumpIndex);
        } else {
            System.out.println("Search element " + elementForSearch + " didn't find in the our array.");
        }

    }

}
