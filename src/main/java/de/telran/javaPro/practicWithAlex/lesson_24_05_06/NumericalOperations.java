package de.telran.javaPro.practicWithAlex.lesson_24_05_06;

/**
 * Создайте обобщенный интерфейс для калькулятора, в котором будут объявлен перечень операций,
 * которые умеет делать ваш калькулятор add, sub, multi и div и реализуйте классы, которые
 * будут включать данный интерфейс для работы с различными типами данных аргументов.
 * @param <T>
 */
public interface NumericalOperations<T extends  Number>{
    T add(T a, T b);
    T sub(T a, T b);
    T multi(T a, T b);
    T div(T a, T b);
}
