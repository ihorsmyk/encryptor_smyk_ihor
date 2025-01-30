package org.javarush;

import java.util.Scanner;

class CLI {
    void run() {
        String command, fileAddress, key;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть команду (ENCRYPT або DECRYPT) ->");
        command = scanner.nextLine();

        System.out.print("Введіть адресу файлу ->");
        fileAddress = scanner.nextLine();

        System.out.print("ВВедіть ключ шифрування ->");
        key = scanner.nextLine();

        ApplicationCore applicationCore = new ApplicationCore();
        applicationCore.execute(command, fileAddress, key);
    }
}

