public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр(объект) класса Computer
        // с помощью конструктора по-умолчанию
        Computer computer1 = new Computer();
        // Присвоим значение полю mark для объекта computer1
        computer1.setMark("Dell");

        computer1.setModel("Inspiron 3520");
        computer1.setType("Laptop");
        computer1.setCPU("Intel Pentium M360");
        computer1.setGPU("Intel HD Graphics 4000");
        computer1.setCountOfRAMGb(4);
        computer1.setTypeOfScreen("TFT");
        computer1.setScreenDiagonal(15.6);
        computer1.setResolutionX(1366);
        computer1.setResolutionY(768);
        computer1.setOS("Windows 10 and Linux Ubuntu 17.04");
        computer1.setCost(Double.POSITIVE_INFINITY);

        // Вызываем метод showInformation для объекта computer1,
        // который выведет полную информацию о данном объекте
        computer1.showInformation();

        // Создаём объект класса Computer
        // используя пользовательский конструктор,
        // который инициализирует поля значениями,
        // которые мы передаем в конструктор
        Computer computer2 = new Computer(
                "Laptop",
                "Intel Core i9 6300",
                "Nvidia GeForce GTX 1080TI",
                256,
                "Retina",
                21,
                3840,
                2160,
                "DOS",
                "It-school",
                "Wunder-Вафля",
                Double.POSITIVE_INFINITY);

        // Выводим информацию об объекте computer2
        computer2.showInformation();

        String[] arrayCPU = {"Intel Core i9 6300",
                "Intel Pentium M360",
                "AMD A10 7870k"};
        String[] arrayGPU = {"Intel HD Graphics 4000",
                "Nvidia GeForce GTX 1080TI",
                "Nvidia GeForce GTX 1060TI"};

        // Создаём объект класса Game
        Game game = new Game("Half Life 3",
                16,
                arrayCPU,
                arrayGPU);

        // Выводим информацию об объекте game
        game.showInfoAboutGame();

        if (computer1.isDontDestoyed(game)){
            System.out.println("\nИгрушка пойдет");
        }
        else
        {
            System.out.println("\nИгрушка не пойдет");
        }

        GameForTargetPlatform gameForTargetPlatform =
                new GameForTargetPlatform();

    }
}
