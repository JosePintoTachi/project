
package Main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jose Pinto
 */
public class FootballManager {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/fcplo/Documents/NetBeansProjects/FootballManager/project/FootballManager/build/classes/Main/DatabaseFM.txt";
        Database database = new Database(fileName);
        database.readFile(StandardCharsets.UTF_8);
    }
    
}
