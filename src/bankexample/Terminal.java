package bankexample;

import java.util.Scanner;

public class Terminal {
    int numberTerminal;

    void workWithTerminal(Card card) {
        Scanner scanner = new Scanner(System.in);

        String pin;

        do {
            System.out.println("Введите PIN : ");
            pin = scanner.next();
            if (!pin.equals(card.pin))
                System.out.println("Введен неправильный PIN\n" +
                        "Завершена работа с картой");
        } while (!pin.equals(card.pin));

        System.out.println(card.account);
        System.out.println(card.money);
        System.out.println(card.firstName);
        System.out.println(card.secondName);
    }
}
