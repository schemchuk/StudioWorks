package de.telran.stanislavsPacage.lesson4.enumCoffee;

public class EnumCoffee2 {
    enum CoffeeSize {Big(150), Medium(100), Small(50);

        private int ml;
        CoffeeSize(int ml) {
            this.ml = ml;
        }

        public int getMl() {
            return ml;
        }
    }

    CoffeeSize size;

}
