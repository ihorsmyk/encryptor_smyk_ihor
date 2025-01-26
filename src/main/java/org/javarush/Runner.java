package org.javarush;

import java.nio.file.Path;

public class Runner {
    void run(String[] args) {
        String command = args[0];
        String fileAddress = args[1];
        int key = Integer.parseInt(args[2]);
        key = key % Constants.UNICODE_SYMBOLS_COUNT;
        Path path = PathCreator.createPath(fileAddress);
        FileService fileService = new FileService();
        String txt = fileService.readFile(path);

        CaesarCipher cc = new CaesarCipher();
        if (command.equals("ENCRYPT")) {
            Path pathEncrypted = PathCreator.createPath("txt_files", "result", "[ENCRYPTED]", "txt");
            fileService.writeFile(pathEncrypted, cc.encrypt(txt, key));
        } else if (command.equals("DECRYPT")) {
            Path pathDecrypted = PathCreator.createPath("txt_files", "result", "[DECRYPTED]", "txt");
            fileService.writeFile(pathDecrypted, cc.decrypt(txt, key));
        }
    }
}
