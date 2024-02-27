package de.telran.grogAlgorytm.lesson_24_02_27;



public class StackPop {
    int[] items = new int[0];

    public int push(int... values){
        int[] updatedArray = new int[items.length+values.length];
        for (int i=0;i<items.length;i++){
            updatedArray[i] = items[i];
        }
        for (int i=0;i<values.length;i++){
            updatedArray[i+items.length] = values[i];
        }
        items = updatedArray;
        return items.length;
    }

    public int pop(){
        if (items.length == 0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int[] updatedArray = new int[items.length-1];
        for (int i=0;i<updatedArray.length;i++){
            updatedArray[i] = items[i];
        }
        int lastElement = items[items.length-1];
        items = updatedArray;
        return lastElement;
    }

    public int findMax() {
        if (items.length == 0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int max = this.items[0];
        for (int i = 1; i < this.items.length; i++) {
            if (this.items[i] > max) max = this.items[i];
        }
        return max;
    }

    public int findMin() {
        if (items.length == 0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int min = this.items[0];
        for (int i = 1; i < this.items.length; i++) {
            if (this.items[i] < min) min = this.items[i];
        }
        return min;
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса StackPop
        StackPop stack = new StackPop();

        // Пример использования метода push
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(33);
        System.out.println("Новая длина стека: " + stack.push(55));

        // Пример использования метода push для добавления нескольких элементов одновременно
        System.out.println("Новая длина стека: " + stack.push(10, 20, 30, 40, 50));

        // Выводим стек после добавления элементов
        System.out.println("Стек после добавления элементов: " + Arrays.toString(stack.items));


        // Пример использования метода pop
        System.out.println("Удаленный элемент из стека: " + stack.pop());

        // Пример использования метода findMax        // Пример использования метода push для добавления нескольких элементов одновременно
        //        System.out.println("Новая длина стека: " + stack.push(10, 20, 30, 40, 50));
        //
        //        // Выводим стек после добавления элементов
        //        System.out.println("Стек после добавления элементов: " + Arrays.toString(stack.items));
        //    }
        System.out.println("Максимальное значение в стеке: " + stack.findMax());

        // Пример использования метода findMin
        System.out.println("Минимальное значение в стеке: " + stack.findMin());
    }
}
