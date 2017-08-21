package gameexample;

public class OrcWarrior extends Unit{
    public OrcWarrior(String weapon, int hp, int mp, int level, int damage, int strength, int agility, int intel) {
        super(weapon, hp, mp, level, damage, strength, agility, intel);
    }

    public OrcWarrior() {
    }

    void punch(){
        System.out.println("Орк ударяет");
    }

    void berzerk(){
        System.out.println("Орк в ярости!!! Арггг!!!");
    }
}
