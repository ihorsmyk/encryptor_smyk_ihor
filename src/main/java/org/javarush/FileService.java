package org.javarush;

import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileService {
    public String readFile(Path path) {
        StringBuilder strBuilder = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                strBuilder.append(line);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuilder.toString();
    }

    public void writeFile(Path path, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
