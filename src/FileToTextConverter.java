import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileToTextConverter {

    public static String[] RefractorTextToCorrectArray(File file) {
        BufferedReader buf = null;
        String line;
        try {
            buf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }
        try {
            line = buf.readLine();
            StringBuilder sb = new StringBuilder();
            while(line != null){
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            String fileAsString = sb.toString().replaceAll("[^a-zA-ZæøåÆØÅ ]","").toUpperCase();
            String[] rawTextArray = fileAsString.split(" ");
            return rawTextArray;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
