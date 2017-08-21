package gameexample;

public class SwordMan extends Unit {
    // Пользовательский конструктор
    public SwordMan(String weapon,
                    int hp,
                    int mp,
                    int level,
                    int damage,
                    int strength,
                    int agility,
                    int intel) {
        // Если указано ТОЛЬКО ключевое слово super, в
        // Конструкторе производного класса (наследника),
        // то вызывается конструктор базового класса (родителя)
        super(weapon, hp, mp, level, damage, strength, agility, intel);
    }

    // Конструктор по-умолчанию
    public SwordMan() {

    }

    void slash() {
        System.out.println("Мечник рубит");
    }

    void defense() {
        System.out.println("Воин защищает союзников");
    }
}
