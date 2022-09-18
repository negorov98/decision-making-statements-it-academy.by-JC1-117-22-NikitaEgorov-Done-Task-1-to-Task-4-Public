public class Task3AlternativeSolution {
    public static void main(String[] args) {
        int time = 12;

        if (time >= 0 && time < 6) {
            System.out.println("Good night!");
        } else if (time >= 6 && time < 12) {
            System.out.println("Good morning!");
        } else if (time >= 12 && time < 18) {
            System.out.println("Good day!");
        } else if (time >= 18 && time <24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("The value is not correct");
        }
    }
}
