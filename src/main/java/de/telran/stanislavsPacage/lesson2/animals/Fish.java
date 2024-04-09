package de.telran.stanislavsPacage.lesson2.animals;

public class Fish extends Animal{

    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }



    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    @Override
    void breatch() {

        System.out.println("Gilts");
    }
}
