package org.javarush;

import java.util.Scanner;

class CLI {
    void run() {
        String command, fileAddress, key;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the command (ENCRYPT or DECRYPT) ->");
        command = scanner.nextLine();

        System.out.print("Enter the file address ->");
        fileAddress = scanner.nextLine();

        System.out.print("Enter the encryption key ->");
        key = scanner.nextLine();

        ApplicationCore applicationCore = new ApplicationCore();
        applicationCore.execute(command, fileAddress, key);
    }
}

