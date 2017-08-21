import org.omg.CORBA.CODESET_INCOMPATIBLE;

public class Computer {
    // private - член класса (метод, поле, конструктор)
    // доступен ТОЛЬКО внутри класса

    // default(указывает по-умолчанию,
    // если не указан другой модификатор доступа) -
    // член класса (метод, поле, конструктор)
    // доступен в любом другом классе в ДАННОМ пакете

    // public - член класса(метод, поле, конструктор)
    // доступен абсолютно из любого класса в любом пакете
    // для проекта

    // Тип устройства
    private String type;
    // Процессор компьюетера
    private String CPU;
    // Видеокарта
    private String GPU;
    // Количество оперативной памяти
    private int countOfRAMGb;
    // Тип экрана
    private String typeOfScreen;
    // Размер диагонали экрана
    private double screenDiagonal;
    //  Ширина экрана в пикселях
    private int resolutionX;
    // Высота экрана в пикселях
    private int resolutionY;
    // Операционная система устройства
    private String OS;
    // Марка
    private String mark;
    // Модель
    private String model;
    // Цена
    private double cost;

    // Конструктор по-умолчанию,
    // который инициализирует поля значениями по-умолчанию
    Computer() {

    }

    // Alt + Insert. Выбрать "Constructor"
    // Пользовательский конструктор для класса Computer,
    // который инициализирует поля значенями которые мы передадим
    // в конструктор
    public Computer(String type,
                    String CPU,
                    String GPU,
                    int countOfRAMGb,
                    String typeOfScreen,
                    double screenDiagonal,
                    int resolutionX,
                    int resolutionY,
                    String OS,
                    String mark,
                    String model,
                    double cost) {
        this.type = type;
        this.CPU = CPU;
        this.GPU = GPU;
        this.countOfRAMGb = countOfRAMGb;
        this.typeOfScreen = typeOfScreen;
        this.screenDiagonal = screenDiagonal;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.OS = OS;
        this.mark = mark;
        this.model = model;
        this.cost = cost;
    }

    // Методы доступа (set- , get- ) - специальные методы
    // внутри класса, которые предоставляют ПРАВИЛЬНЫЙ(православный)
    // доступ к полям класса. И является одним из важнейших
    // инструментов Инкапсуляции (сокрытия реализации членов класса).
    // МД set(запись) - предназначен для изменения значения поля
    // МД get(чтение) - предназначения для получения значения поля

    // Метод доступа для изменения значения поля type
    void setType(String value) {
        type = value;
    }

    // Метод доступа для получения значения поля type
    String getType() {
        return type;
    }

    // Alt + Ins + "Getter ana Setter"


    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getCountOfRAMGb() {
        return countOfRAMGb;
    }

    public void setCountOfRAMGb(int countOfRAMGb) {
        this.countOfRAMGb = countOfRAMGb;
    }

    public String getTypeOfScreen() {
        return typeOfScreen;
    }

    public void setTypeOfScreen(String typeOfScreen) {
        this.typeOfScreen = typeOfScreen;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    void showInformation() {
        System.out.println(
                "\nMark            : " + mark +
                        "\nModel           : " + model +
                        "\nType            : " + type +
                        "\nCPU             : " + CPU +
                        "\nGPU             : " + GPU +
                        "\nRAM             : " + countOfRAMGb +
                        "\nType of screen  : " + typeOfScreen +
                        "\nScreen Diagonal : " + screenDiagonal +
                        "\nResolution      : " + resolutionX + "x" + resolutionY +
                        "\nOS              : " + OS +
                        "\nCost            : " + cost);
    }

    boolean isDontDestoyed(Game game) {
        if (countOfRAMGb <= game.getCountOfRAM()) {
            System.out.println("Слишком мало памяти");
            return false;
        }

        boolean flagCPU = false;
        boolean flagGPU = false;

        String[] arrayCPU = game.getArraysCPU();
        String[] arrayGPU = game.getArraysGPU();

        for (int i = 0; i < arrayCPU.length; i++) {
            if (CPU.equals(arrayCPU[i])) {
                flagCPU = true;
                break;
            }
        }

        if (!flagCPU) {
            System.out.println("Процессор не подходит");
            return false;
        }

        // Также делаем для видеокарты

        for (int i = 0; i < arrayGPU.length; i++) {
            if (GPU.equals(arrayGPU[i])) {
                flagGPU = true;
                break;
            }
        }

        if (!flagGPU) {
            System.out.println("Видеокарта не подходит");
            return false;
        }

        return true;
    }
}
