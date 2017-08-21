package gameexample;

public class Knight extends SwordMan{
    public Knight(String weapon, int hp, int mp, int level, int damage, int strength, int agility, int intel) {
        super(weapon, hp, mp, level, damage, strength, agility, intel);
    }

    public Knight() {
    }

    void heal(){
        System.out.println("Рыцарь лечит союзников");
    }
}
