package fileHandling;
import java.io.*;
public class VowelWordCopier {
  public static void main(String[] args) {
        try {
            // File reader for ONE.TXT
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/fileHandling/ONE.TXT"));
            // File writer for TWO.TXT
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/fileHandling/TWO.TXT"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Split line into words
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 0) {
                        char firstChar = Character.toLowerCase(word.charAt(0));
                        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' ||
                            firstChar == 'o' || firstChar == 'u') {
                            writer.write(word + " ");
                        }
                    }
                }
            }
            // Close files
            reader.close();
            writer.close();
            System.out.println("Words starting with vowels copied to TWO.TXT");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
