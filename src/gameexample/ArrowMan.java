package gameexample;

public class ArrowMan extends Unit {
    public ArrowMan(String weapon, int hp, int mp, int level, int damage, int strength, int agility, int intel) {
        super(weapon, hp, mp, level, damage, strength, agility, intel);
    }

    public ArrowMan() {

    }

    void shot(){
        System.out.println("Лучник стреляет");
    }

    void stun(){
        System.out.println("Лучник оглушает цель");
    }
}
