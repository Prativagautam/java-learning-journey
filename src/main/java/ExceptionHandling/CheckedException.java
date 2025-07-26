package ExceptionHandling;
import java.io.*;
public class CheckedException {




    // This method declares that it might throw an IOException
    public static void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    
}

}
