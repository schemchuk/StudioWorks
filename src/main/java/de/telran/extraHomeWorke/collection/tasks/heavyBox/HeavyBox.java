package de.telran.extraHomeWorke.collection.tasks.heavyBox;

import java.util.Objects;

public class HeavyBox implements Comparable<HeavyBox> {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox box = (HeavyBox) o;
        return weight == box.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.getWeight() - o.getWeight();
    }
}
