import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Record {
    public void readFromFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to read from: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to write to: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the text to write: ");
        String text = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Record record = new Record();
        record.readFromFile();
        record.writeToFile();
    }
}
