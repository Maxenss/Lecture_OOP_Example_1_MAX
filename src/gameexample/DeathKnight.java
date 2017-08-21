package gameexample;

public class DeathKnight extends Knight{
    public DeathKnight(String weapon, int hp, int mp, int level, int damage, int strength, int agility, int intel) {
        super(weapon, hp, mp, level, damage, strength, agility, intel);
    }

    public DeathKnight() {
    }

    void curse(){
        System.out.println("Рыцарь смерти проклинает кого-то");
    }
}
