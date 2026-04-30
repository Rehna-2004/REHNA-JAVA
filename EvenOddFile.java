import java.io.*;
import java.util.*;

public class EvenOddFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Create input file with user input
            FileWriter inputWriter = new FileWriter("input.txt");

            System.out.print("Enter how many numbers: ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                inputWriter.write(num + " ");
            }
            inputWriter.close();

            // Step 2: Read from input file
            File inputFile = new File("input.txt");
            Scanner fileReader = new Scanner(inputFile);

            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            // Step 3: Separate even and odd numbers
            while (fileReader.hasNextInt()) {
                int num = fileReader.nextInt();

                if (num % 2 == 0) {
                    evenWriter.write(num + " ");
                } else {
                    oddWriter.write(num + " ");
                }
            }

            // Close all resources
            fileReader.close();
            evenWriter.close();
            oddWriter.close();
            sc.close();

            System.out.println("Process completed!");
            System.out.println("Check input.txt, even.txt, and odd.txt");

        } catch (IOException e) {
            System.out.println("Error handling file!");
        }
    }
}