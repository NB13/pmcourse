package by.bsu.metelsky;

import by.bsu.metelsky.model.Tree;

import java.util.Scanner;

public class Main {

    protected enum Method {
        grow, shake, bloom, exit
    }

    protected static Tree tree = new Tree();


    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            input = scanner.nextLine();
            Method method = null;
            try {
                method = Method.valueOf(input);
            } catch (Exception e) {
                System.out.println("Unknown method");
                continue;
            }
            switch (method) {
                case grow: {
                    tree.grow();
                    break;
                }
                case shake: {
                    tree.shake();
                    break;
                }
                case bloom:{
                    tree.bloom();
                    break;
                }
            }
            System.out.println("Seed grown " + tree.seedGrown + ", shaked " + tree.seedShaked);
            if (method == Method.exit) {
                break;
            }
        }
    }
}
