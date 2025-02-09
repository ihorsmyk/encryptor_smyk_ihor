package org.javarush;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            CLI cli = new CLI();
            cli.run();
        } else {
            ApplicationCore applicationCore = new ApplicationCore();
            applicationCore.execute(args[0], args[1], args[2]);
        }
    }
}
