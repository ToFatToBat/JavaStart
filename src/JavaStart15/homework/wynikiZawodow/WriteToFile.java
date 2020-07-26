package JavaStart15.homework.wynikiZawodow;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    private String fileName = "GameResult.csv";
    private File file = new File(fileName);

    public void writeDataToFile(Player player) throws IOException {

        try (


                var fileWriter = new FileWriter(file);
                var writer = new BufferedWriter(fileWriter);
        ) {
            writer.write(player.getFirstName());
            writer.write(";");
            writer.write(player.getLastName());
            writer.write(";");
            writer.write(String.valueOf(player.getScore()));
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Nie udało się zapisać do pliku.");
        }

    }
}
