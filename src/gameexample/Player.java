package gameexample;

public class Player extends Unit{
    public Player(String weapon, int hp, int mp, int level, int damage, int strength, int agility, int intel) {
        super(weapon, hp, mp, level, damage, strength, agility, intel);
    }

    public Player() {
    }

    void control(){
        System.out.println("Игроком управляет");
    }

    void leaveFromMatch(){
        System.out.println("Игрок покинул матч. Он крайне плох.");
    }


}
