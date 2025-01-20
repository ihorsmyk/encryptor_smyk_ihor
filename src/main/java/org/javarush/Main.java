package org.javarush;

import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String command = args[0];
        String file = args[1];
        String key = args[2];

        System.out.println(Arrays.asList(args));

        Path path = PathCreator.createPath("txt_files", "test", "", "txt");   // "txt_files\\test.txt";
        Path path1 = PathCreator.createPath("txt_files", "test", "[ENCRYPTED]", "txt");

        FileService fileService = new FileService();
        String txt = fileService.readFile(path);

        System.out.println(txt);

        fileService.writeFile(path1, txt);
    }
}
