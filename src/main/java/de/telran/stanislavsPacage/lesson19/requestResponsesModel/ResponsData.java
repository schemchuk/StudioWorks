package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class ResponsData {
    String response;
    boolean isCorrect;
    String status; //код ошибки

    public ResponsData(String response, boolean isCorrect, String status) {
        this.response = response;
        this.isCorrect = isCorrect;
        this.status = status;
    }
}
