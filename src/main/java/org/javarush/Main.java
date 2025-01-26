package org.javarush;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String command = args[0];
        String fileAddress = args[1];
        int key = Integer.parseInt(args[2]);
        key = key % 149813;

        Path path = PathCreator.createPath(fileAddress);

        FileService fileService = new FileService();
        String txt = fileService.readFile(path);

        CaesarCipher cc = new CaesarCipher();
        String resultString = "";
        if (command.equals("ENCRYPT")) {
            Path pathEncrypted = PathCreator.createPath("txt_files", "result", "[ENCRYPTED]", "txt");
            resultString = cc.encrypt(txt, key);
            fileService.writeFile(pathEncrypted, resultString);
        } else if (command.equals("DECRYPT")) {
            Path pathDecrypted = PathCreator.createPath("txt_files", "result", "[DECRYPTED]", "txt");
            resultString = cc.decrypt(txt, key);
            fileService.writeFile(pathDecrypted, resultString);
        }
    }
}
