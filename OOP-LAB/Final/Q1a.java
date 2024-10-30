import java.io.*;
import java.util.*;
public class Q1a {
    public static void main(String[] args) {
        String read = "README.txt";
        String outcome = "OUTCOME-1.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(read));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
            reader.close();
            String[] words = content.toString().split("\\s+");
            Map<String, Integer> wordCountMap = new TreeMap<>();
            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort(Map.Entry.comparingByKey());
            BufferedWriter writer = new BufferedWriter(new FileWriter(outcome));
            for (Map.Entry<String, Integer> entry : sortedWords) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
            writer.close();
            System.out.println("Output: " + outcome);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}