package de.telran.stanislavsPacage.lesson4.search;

public class SearchIUtils {
    static int linearSearch(int[] workingArray, int elementForSearch, boolean isFirst){

        int indexForSearch = -1;

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == elementForSearch){
                indexForSearch = i;
                if (isFirst) {
                    return indexForSearch;
                }
            }
        }
        return indexForSearch;
    }

    static int jumpSearch(int[] workingArray, int elementForSearch){
        int arrayLength = workingArray.length;
        int jumpInterval = (int) Math.sqrt(arrayLength);
        int previousInterval = 0;

        while (workingArray[Math.min(jumpInterval,arrayLength) - 1] < elementForSearch){
            previousInterval = jumpInterval;
            jumpInterval+= (int) Math.sqrt(arrayLength);
            if (previousInterval >= arrayLength)
                return -1;
        }

        while (workingArray[previousInterval] < elementForSearch){
            previousInterval++;
            if (previousInterval == Math.min(jumpInterval,arrayLength)) return -1;
        }
        if (workingArray[previousInterval] == elementForSearch) return previousInterval;

        return -1;
    }
}
