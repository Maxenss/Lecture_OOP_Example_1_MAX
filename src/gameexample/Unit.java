package gameexample;

public abstract class Unit {
    String weapon;

    int hp;
    int mp;
    int level;
    int damage;

    int strength;
    int agility;
    int intel;

    public Unit(String weapon,
                int hp,
                int mp,
                int level,
                int damage,
                int strength,
                int agility,
                int intel) {
        this.weapon = weapon;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.damage = damage;
        this.strength = strength;
        this.agility = agility;
        this.intel = intel;
    }

    public Unit() {

    }

    void showInfo() {
        System.out.println(
                "\nWeapon       : " + this.weapon +
                        "\nHP           : " + this.hp +
                        "\nMP           : " + this.mp +
                        "\nLevel        : " + this.level +
                        "\nDamage       : " + this.damage +
                        "\nStrength     : " + this.strength +
                        "\nAgility      : " + this.agility +
                        "\nIntelligence : " + this.intel);
    }
}
