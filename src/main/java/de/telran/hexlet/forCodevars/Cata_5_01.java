package de.telran.hexlet.forCodevars;

public class Cata_5_01 {
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static int Past(int h, int m, int s) {
        int result = h * 3600 * 1000 + m * 60 * 1000 + s * 1000;
        return result;
    }

//    public static String high(String s) {
//        String[] words =s.split(" ");
//        int maxSkore = 0;
//        String highestScoringWord = "";
//
//        for(String word : words){
//            int wordScore = calculateWordScore(word);
//            if (wordScore > maxSkore) {
//                maxSkore = wordScore;
//                highestScoringWord = word;
//            }
//        }
//        return highestScoringWord;
    // }

//    public static  int calculateWordScore(String word) {
//        int score = 0;
//        for (char letter : word.toCharArray()) {
//            score += getAlphabetValue(letter);
//        }
//        return score;
//    }
//    public static int getAlphabetValue(char letter) {
//        return Character.toLowerCase(letter) - 'a' + 1;
//    }
//

    public static String high(String s) {

        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;
            }
        }

        return winner;
    }

    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }
        return result.toString();
    }

    public class HelloWorld {
        public static String helloWorld() {
            return "hello world!";
        }
    }

    public static void main(String[] args) {
        String inputString = " Sraka banka test wokylary hello";
        String result = high(inputString);
        System.out.println("Highest scoring word: " + result);

        System.out.println(countingSheep(5));


        System.out.println(HelloWorld.helloWorld());
    }

}
