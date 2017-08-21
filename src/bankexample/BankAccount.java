package bankexample;

public class BankAccount extends Card{
    String passportCode;
    String numberID;
    String street;
    String secretQuestion;
    String answerOnQuestion;
    // Бла-бла-бла


    public BankAccount(String account,
                       String pin,
                       String firstName,
                       String secondName,
                       double money,
                       String passportCode,
                       String numberID,
                       String street,
                       String secretQuestion,
                       String answerOnQuestion) {
        super(account, pin, firstName, secondName, money);
        this.passportCode = passportCode;
        this.numberID = numberID;
        this.street = street;
        this.secretQuestion = secretQuestion;
        this.answerOnQuestion = answerOnQuestion;
    }

    public BankAccount(){

    }
}
