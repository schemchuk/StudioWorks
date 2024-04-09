package de.telran.extraHomeWorke.collection.tasks.multitudes;

import java.util.HashSet;
import java.util.Set;

public class Multitudes {

        public static <T> Set<T> union(Set<? extends T>... sets) {
            Set<T> unionSet = new HashSet<>();
            for (Set<? extends T> set : sets) {
                unionSet.addAll(set);
            }
            return unionSet;
        }

        public static <T> Set<T> intersect(Set<? extends T>... sets) {
            Set<T> intersectSet = new HashSet<>();
            if (sets.length > 0) {
                // Создаем копию первого множества
                Set<T> firstSetCopy = new HashSet<>(sets[0]);
                intersectSet.addAll(firstSetCopy);
                // Выполняем операцию пересечения с остальными множествами
                for (Set<? extends T> set : sets) {
                    intersectSet.retainAll(set);
                }
            }
            return intersectSet;
        }
    }

