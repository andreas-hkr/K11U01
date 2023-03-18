import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in max 1000 tal från användaren och skriv sen ut dem, men skriv bara ut varje tal en gång

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[1000];
        int count = 0;

        while (input.hasNextInt()) {
            numbers[count] = input.nextInt();
            count++;
        }

        for (int i=0; i < count; i++) {
            boolean found = false;
            for (int j=0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    found = true;
                }
            }
            if (!found) {
                System.out.print(numbers[i] + "  ");
            }
        }
    }
}