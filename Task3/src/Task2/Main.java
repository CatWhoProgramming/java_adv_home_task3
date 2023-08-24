package Task2;

import java.io.*;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
        String[] arr = {"11", "21", "3", "40", "56", "77", "1"};
        try {
            OutputStream os = new FileOutputStream("file.txt");
            for (int i = 0; i < arr.length; i++) {
                os.write(arr[i].getBytes());
            }
            os.close();

            InputStream is = new FileInputStream("file.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
