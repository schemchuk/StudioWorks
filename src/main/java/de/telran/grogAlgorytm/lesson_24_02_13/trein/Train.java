package de.telran.grogAlgorytm.lesson_24_02_13.trein;

public class Train {
    Wagon root;

    Train(int value) {
        this.root = new Wagon(value);
    }

    public void addWagon(int value) {
        Wagon current = this.root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Wagon(value);
    }

    public int numberOfWagons() {
        int count = 0;
        Wagon current = this.root;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

   public boolean isWagon(int value) {
        Wagon current = this.root;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;

        }
        return false;
    }
    public int findIndex(int value) {
        int index = 1;
        Wagon current = this.root;
        while (current != null) {
            if (current.value == value) {
                return index;

            }
            current = current.next;
            index++;
        }

        return -1;

    }

    public int wagonIndex(int value) {
        int index=1;
        Wagon current = this.root;
        while (current != null) {
            if (value == current.value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
}

