import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println("Input float:");
            System.out.println("You input " + userFloat());
        } catch (Exception e) {
            System.out.println("You input not float!\nPlease repeat input:");
            System.out.println("You input " + userFloat());
        }
    }

    public static float userFloat() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}