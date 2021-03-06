/**
 * Created by EE on 04.10.2017.
 */

package task6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // count the number of times a particular character
    public static int countChars(InputStreamReader reader, char c) throws IOException {
        int count = 0;

        BufferedReader bufferedReader = new BufferedReader(reader);

        String currentLine;

        while ((currentLine = bufferedReader.readLine()) != null) {
            for (int i = 0; i < currentLine.length(); ++i) {
                if (currentLine.charAt(i) == c) {
                    ++count;
                }
            }
        }

        bufferedReader.close();

        return count;
    }

    public static void main(String[] args) throws IOException {
        String filepath = args[0];

        char c = args[1].charAt(0);

        InputStreamReader reader = new InputStreamReader(new FileInputStream(filepath), "UTF-8");

        int count = Main.countChars(reader, c);

        reader.close();

        System.out.println(count);
    }
}
