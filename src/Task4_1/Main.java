package Task4_1;

import java.io.File;
import java.io.IOException;

/**
 * Created by Вова on 18.06.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        File f1 = new File("/", "developers.txt");
        if (!f1.exists()){
            f1.createNewFile();
        }
    }
}
