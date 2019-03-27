import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class FileToTextConverter {

    static String[] RefractorTextToCorrectArray(File file) {
        BufferedReader buf = null;
        String line;
        try {
            buf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            line = Objects.requireNonNull(buf).readLine();
            StringBuilder sb = new StringBuilder();
            while(line != null){
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            String fileAsString = sb.toString().replaceAll("[^a-zA-ZæøåÆØÅ ]","").toUpperCase();
            return fileAsString.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
