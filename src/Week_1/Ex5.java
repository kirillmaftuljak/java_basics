package Week_1;

public class Ex5 {
    public Ex5() {
    }

    public static void main(String[] args) {
            int days = 365;
            int dayHours = 24;
            int minutesInHour = 60;
            int secondsInHour = 60;

            int secondsInYear = days * dayHours * minutesInHour * secondsInHour;
        System.out.println(secondsInYear);
    }


}
