package ru.gb.jseminar;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Task3 {

    // Напишите программу, которая
    // 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
    // 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
    // 3) сохраняет файл локально
    // 4) читает сохраненный файл и выводит содержимое в логгер
    // 5) удаляет сохраненный файл
    public static void main(String[] args) throws MalformedURLException {

               
        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

        
        System.out.print(download(fileUrl));

    }

    static public String download(String url) throws MalformedURLException {
        URL ur = new URL(url);
        InputStream input = url.openStream();
;


        return f;
    }

    public String change(String name, String fileContent) {

        return String.format(fileContent, name);
        ;
    }

    public void saveOnLocal(String fileName, String fileContent) {

    }

    public boolean removeFromLocale(String fileName) {

        return false;
    }
}
