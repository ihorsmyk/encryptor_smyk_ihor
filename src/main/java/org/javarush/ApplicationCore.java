package org.javarush;

import java.nio.file.Path;

class ApplicationCore {
    final int UNICODE_SYMBOLS_COUNT = 149_813;
    String command;
    String fileAddress;
    int key;

    void execute(String command, String fileAddress, String key) {
        this.command = command;
        this.fileAddress = fileAddress;
        try {
            this.key = Integer.parseInt(key) % this.UNICODE_SYMBOLS_COUNT;
        } catch (NumberFormatException e) {
            System.err.println("Invalid key format: " + key);
            e.printStackTrace();
            return;
        }

        Path path = PathCreator.createPath(this.fileAddress);
        FileService fileService = new FileService();
        String txt = fileService.readFile(path);
        CaesarCipher cc = new CaesarCipher();

        if (this.command.equals("ENCRYPT")) {
            Path pathEncrypted = PathCreator.createPath("txt_files", "result", "[ENCRYPTED]", "txt");
            fileService.writeFile(pathEncrypted, cc.encrypt(txt, this.key));
        } else if (this.command.equals("DECRYPT")) {
            Path pathDecrypted = PathCreator.createPath("txt_files", "result", "[DECRYPTED]", "txt");
            fileService.writeFile(pathDecrypted, cc.decrypt(txt, this.key));
        }
    }
}
