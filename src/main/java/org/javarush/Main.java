package org.javarush;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            CLI cli = new CLI();
            //  cli.run();
        } else {
            Runner runner = new Runner();
            runner.run(args);
        }
    }
}
