import java.util.Arrays;

public class Game {
    // Название игры
    private String title;
    // Количество ОЗУ
    private int countOfRAM;
    // Массив процессоров, которые поддерживаются
    private String[] arraysCPU;
    // Массив видеокарт, которые поддерживаются
    private String[] arraysGPU;

    // Пользовательский конструктор
    public Game(String title,
                int countOfRAM,
                String[] CPU,
                String[] GPU) {
        this.title = title;
        this.countOfRAM = countOfRAM;
        this.arraysCPU = CPU;
        this.arraysGPU = GPU;
    }

    public Game(){

    }


    // ---------------------------------
    // Методы доступа
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCountOfRAM() {
        return countOfRAM;
    }

    public void setCountOfRAM(int countOfRAM) {
        this.countOfRAM = countOfRAM;
    }

    public String[] getArraysCPU() {
        return arraysCPU;
    }

    public void setArraysCPU(String[] arraysCPU) {
        this.arraysCPU = arraysCPU;
    }

    public String[] getArraysGPU() {
        return arraysGPU;
    }

    public void setArraysGPU(String[] arraysGPU) {
        this.arraysGPU = arraysGPU;
    }

    // ----------------------------------

    void showInfoAboutGame() {
        System.out.println(
                "\nНазвание игры       : " + title +
                "\nПоддерживаемые CPU  : " + Arrays.toString(arraysCPU) +
                "\nПоддердиваеме GPU   : " + Arrays.toString(arraysGPU) +
                "\nТребуемая RAM       : " + countOfRAM);
    }
}
