package lv.tsi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> personlist = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter command:");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    creat();
                    break;
                case "List":
                    printlist();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("It ins't a command");
            }
        }
    }

    private static void printlist() {
        for (Person p : personlist) {
            System.out.println(p);
        }
    }

    private static void creat() {
        System.out.println("Enter firstname:");
        String firstname = scanner.next();

        System.out.println("Enter secondname");
        String secondname = scanner.next();

        System.out.println("Enter phone");
        String phone = scanner.next();

        Person p = new Person();
        p.setFirstname(firstname);
        p.setSecondname(secondname);
        p.setPhone(phone);

        personlist.add(p);

        System.out.println(p);
    }
}