package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

public class ToDoEntity {
    private String title;

    public ToDoEntity(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ToDoEntity{" +
                "title='" + title + '\'' +
                '}';
    }
}
