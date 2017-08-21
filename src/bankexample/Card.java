package bankexample;

public abstract class Card {
    public Card(String account, String pin, String firstName, String secondName, double money) {
        this.account = account;
        this.pin = pin;
        this.firstName = firstName;
        this.secondName = secondName;
        this.money = money;
    }

    public Card() {
    }

    String account;
    String pin;
    String firstName;
    String secondName;
    double money;
}
