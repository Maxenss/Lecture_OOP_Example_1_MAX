package gameexample;

public class Main {
    public static void main(String[] args) {
        SwordMan swordMan = new SwordMan(
                "Фростморн",
                100,
                50,
                1,
                10,
                15,
                5,
                1
        );
        ArrowMan arrowMan = new ArrowMan(
                "Большой лук драконоборца",
                8000000,
                6000000,
                110,
                100500,
                1500,
                5000,
                1000
        );
        OrcWarrior orcWarrior = new OrcWarrior(
                "Taaaaaapor",
                150,
                0,
                2,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                0,
                Integer.MIN_VALUE
        );
        Knight knight = new Knight(
                "Фростморн",
                110,
                60,
                2,
                10,
                15,
                5,
                2);

        Player player = new Player(
                "Большой лук драконоборца",
                8000000,
                6000000,
                110,
                100500,
                1500,
                5000,
                1000);

        System.out.println("\nИнформация о мечнике : ");
        swordMan.showInfo();
        swordMan.defense();
        swordMan.slash();

        System.out.println("\nИнформация о лучнике : ");
        arrowMan.showInfo();
        arrowMan.shot();
        arrowMan.stun();

        System.out.println("\nИнформация о орке-воине : ");
        orcWarrior.showInfo();
        orcWarrior.punch();
        orcWarrior.berzerk();

        System.out.println("\nИнформация о рыцаре : ");
        knight.showInfo();
        knight.defense();
        knight.heal();
        knight.slash();

        System.out.println("\nИнформация о игроке : ");
        player.showInfo();
        player.control();
        player.leaveFromMatch();

        // Приведение типа (целочисленного к вещественному)
        int a = 20;
        double b = a;

        // Приведение типа (объекта класса наследника к родительскому классу)
        // Up-cast
        SwordMan swordMan2 = (SwordMan) knight;

        // Приведение типа (объекта базового(родительского)
        // класса к объекту производного класса)
        // Down-cast
        knight = (Knight) swordMan2;
    }
}
