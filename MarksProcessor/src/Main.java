import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Step 1: Read six marks from the user
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Print all the marks
        System.out.println("\nMarks entered: " + Arrays.toString(marks));

        // Step 2: Count marks in different categories
        int fail = 0, pass = 0, secondClass = 0, upperSecondClass = 0, firstClass = 0;

        for (int mark : marks) {
            if (mark < 40) {
                fail++;
            } else if (mark >= 40 && mark <= 49) {
                pass++;
            } else if (mark >= 50 && mark <= 59) {
                secondClass++;
            } else if (mark >= 60 && mark <= 69) {
                upperSecondClass++;
            } else {
                firstClass++;
            }
        }

        // Print the results
        System.out.println("\nNumber of fails (below 40): " + fail);
        System.out.println("Number of passes (40-49): " + pass);
        System.out.println("Number of 2:2 (50-59): " + secondClass);
        System.out.println("Number of 2:1 (60-69): " + upperSecondClass);
        System.out.println("Number of first class (70+): " + firstClass);

        // Step 3: Compute the average
        double average = computeAverage(marks);
        System.out.println("\nAverage mark: " + average);

        // Step 4: Compute the maximum mark
        int maxMark = computeMax(marks);
        System.out.println("Maximum mark: " + maxMark);

        // Step 5: Compute the minimum mark
        int minMark = computeMin(marks);
        System.out.println("Minimum mark: " + minMark);

        // Step 6: Sort the marks
        int[] sortedMarks = sortMarks(marks);
        System.out.println("Sorted marks: " + Arrays.toString(sortedMarks));
    }

    // Method to compute the average of the marks
    public static double computeAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Method to compute the maximum mark
    public static int computeMax(int[] marks) {
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // Method to compute the minimum mark
    public static int computeMin(int[] marks) {
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // Method to sort the marks in ascending order
    public static int[] sortMarks(int[] marks) {
        int[] sortedMarks = Arrays.copyOf(marks, marks.length);
        Arrays.sort(sortedMarks);
        return sortedMarks;
    }
}
