package de.telran.javaPro.lections.lesson_24_03_20.bankCards;

public class Bank {
    public static void main(String[] args) {
        MasterCard masterCard = new MasterCard(1);
        Visa visa = new Visa(2);

//        List<Card> list = Arrays.asList(visa,masterCard);
//        Collections.sort(list);

        System.out.println(masterCard.compareTo(visa));
        System.out.println(visa.compareTo(masterCard));

        Card card = visa;
        System.out.println(masterCard.compareTo(card));
        System.out.println(card.compareTo(masterCard));
    }
}
