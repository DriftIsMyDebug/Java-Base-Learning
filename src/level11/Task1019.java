package level11;

import java.util.Calendar;

public class Task1019 {

    private int currentYear;

    public Task1019() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Task1019 task1019 = new Task1019();
        System.out.println(task1019.getCurrentYear());
    }
}
