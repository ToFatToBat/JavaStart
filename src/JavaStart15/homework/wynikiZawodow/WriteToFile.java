package JavaStart15.homework.wynikiZawodow;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {

    private String fileName = "GameResult.csv";
    private File file = new File(fileName);

    public void writeDataToFile(List<Player> player) throws IOException {

        try (


                var fileWriter = new FileWriter(file);
                var writer = new BufferedWriter(fileWriter);
        ) {
            for (Player p : player) {
                writer.write(String.valueOf(p));
            }

        } catch (IOException e) {
            System.out.println("Nie udało się zapisać do pliku.");
        }

    }
}
