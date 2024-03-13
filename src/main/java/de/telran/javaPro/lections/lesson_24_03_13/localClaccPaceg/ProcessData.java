package de.telran.javaPro.lections.lesson_24_03_13.localClaccPaceg;

import java.util.List;

public class ProcessData {
    public static void main(String[] args) {

    }

    public  void  process(List<String> dataList) {
        class Data{
            String element1;
            String element2;

            @Override
            public String toString() {
                return "Data{" +
                        "element1='" + element1 + '\'' +
                        ", element2='" + element2 + '\'' +
                        '}';
            }

            public Data(String element1, String element2) {
                this.element1 = element1;
                this.element2 = element2;

            }
        }

        Data data1 = new Data(dataList.get(0), dataList.get(1));
        System.out.println(data1);
    }
}
