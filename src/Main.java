import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int sum = 0;
        int num;
        int div = 0;
        int min = 100;
        int max = 0;
        int timesPicked = 0;
        double avg = 0;
        boolean no = false;
        Random rnd = new Random();

        num = SafeInput.getRangedInt(in, "Enter a number 1 to 100", 1, 100);

        for (int i = 0; i < 100 ; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
            div = div + 1;
            sum = dataPoints[i] + sum;
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }

        }
        for (int i = 0; i < 100 ; i++) {
            if (dataPoints[i] == num) {
                timesPicked = timesPicked + 1;
                no = true;
                System.out.println();
                System.out.println();
                System.out.println("The value " + num + " was found at array index " + i );
                break;
            }
        }
        System.out.println();
        System.out.println("The sum is " + sum);
        avg = sum / div;
        System.out.println("The average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.println();
        if (no) {
            System.out.println("Your number was picked " + timesPicked + " time(s).");
        }
        if (!no) {
            System.out.println("Your number was not picked.");
        }
        System.out.println();
        System.out.println("Average of dataPoints is: "  + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int i = 0; i < 100 ; i++) {
            sum = values[i] + sum;
        }
        return sum / values.length;
    }

}

