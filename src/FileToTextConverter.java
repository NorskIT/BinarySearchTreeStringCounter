import java.io.*;
import java.util.ArrayList;

public class FileToTextConverter {


    public static String[] ConvertToText(File file) {
        BufferedReader buf = null;
        try {
            buf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }

        String line = null;
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
