import java.util.Scanner;

public class DisplayBars {
    public static void displayBars(int[] numbers) {
        for (int num : numbers) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + " (between 1 and 30): ");
                int num = scanner.nextInt();
                if (num >= 1 && num <= 30) {
                    numbers[i] = num;
                    break;
                } else {
                    System.out.println("Number must be between 1 and 30.");
                }
            }
        }

        System.out.println("\nDisplaying bars of asterisks:");
        displayBars(numbers);

        scanner.close();
    }
}