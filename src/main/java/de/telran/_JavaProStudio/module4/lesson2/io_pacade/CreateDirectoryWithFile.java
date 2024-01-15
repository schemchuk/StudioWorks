package de.telran._JavaProStudio.module4.lesson2.io_pacade;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryWithFile {
    public static void main(String[] args) {
        String path = "src/backup";
        File directory = new File(path);

        // Проверяем, существует ли директория, и если нет, создаем её
        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            if (created) {
                System.out.println("Директория создана: " + path);
            } else {
                System.out.println("Не удалось создать директорию: " + path);
            }
        }

        // Создаем несколько файлов внутри директории
        try {
            for (int i = 1; i <= 3; i++) {
                String fileName = "file" + i + ".txt";
                File file = new File(directory, fileName);

                if (file.createNewFile()) {
                    System.out.println("Файл создан: " + file.getPath());
                } else {
                    System.out.println("Не удалось создать файл: " + file.getPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
