package de.telran.grogAlgorytm.lesson_24_02_21;

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

    public int countWagons() {
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
    public void removeLastWagon() {
        Wagon current = this.root;
        if (current.next == null)
            throw new Error(
                    "You can't remove a wagon from a train that has only one wagon"
            );
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    public void addWagonIndex(int value, int index) {
        if (index > this.countWagons())
            throw new Error("we don't have enough wagons");
        if (index <= 0) throw new Error("the index should be positive");
        Wagon current = this.root;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Wagon wagon = new Wagon(value);
        wagon.next = current.next;
        current.next = wagon;
    }

    public void removeWagonIndex(int index) {
        if (index > this.countWagons())
            throw new Error("we don't have enough wagons");
        if (index <= 0) throw new Error("the index should be positive");
        Wagon current = this.root;
        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void addWagonBeginning(int value) {
        Wagon firstWagon = new Wagon(value);
        firstWagon.next = this.root;
        this.root = firstWagon;
    }

//    public void addWagonindex(int value) {
//        Wagon newWagon = new Wagon(value);
//        Wagon current = this.root;
//        if (current == null) {
//            this.root = newWagon;
//            return;
//        }
//        int index = 1;
//        while (current.next != null && index < 2) {
//            current = current.next;
//            index++;
//        }
//        newWagon.next = current.next;
//        current.next = newWagon;
//    }
}

