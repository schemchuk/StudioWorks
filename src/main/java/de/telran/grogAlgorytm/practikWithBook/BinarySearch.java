package de.telran.grogAlgorytm.practikWithBook;

class BinarySearch {

    public static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }

            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // Пример использования:
        int[] myList = {1, 3, 5, 7, 9};
        int searchItem = 3;

        Integer result = binarySearch(myList, searchItem);

        if (result != null) {
            System.out.println("Элемент " + searchItem + " найден в позиции " + result);
        } else {
            System.out.println("Элемент " + searchItem + " не найден в списке.");
        }
    }
}

