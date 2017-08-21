package bankexample;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
                "24153632632156417",
                "1111",
                "Алексей",
                "Джавин",
                100550.01,
                "KM24132",
                "1234567890",
                "Gaidara",
                "Имя рыбки, умершей во втором классе",
                "Немо");

        Terminal terminal = new Terminal();

        Card card = (Card) bankAccount;
        terminal.workWithTerminal(card);
    }
}
