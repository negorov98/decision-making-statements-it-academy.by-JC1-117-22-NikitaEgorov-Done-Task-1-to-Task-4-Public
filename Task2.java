import javax.sound.midi.Soundbank;

public class Task2 {
    public static void main(String[] args) {
        int dayOfTheWeek = 3;

        if (dayOfTheWeek == 1) {
            System.out.println("It is Monday");
        } else if (dayOfTheWeek == 2) {
            System.out.println("It is Tuesday");
        } else if (dayOfTheWeek == 3) {
            System.out.println("It is Wednesday");
        } else if (dayOfTheWeek == 4) {
            System.out.println("It is Thursday");
        } else if (dayOfTheWeek == 5) {
            System.out.println("It is Friday");
        } else if (dayOfTheWeek == 6) {
            System.out.println("It is Saturday");
        } else if (dayOfTheWeek == 7) {
            System.out.println("It is Sunday");
        } else {
            System.out.println("The value is not correct");
        }
    }
}
