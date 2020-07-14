package JavaStart12.zajecia.bazaProduktowWPliku;

import JavaStart10.zajecia.porownywanieOsob.Person;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("V90", "Volvo", 270000);
        products[1] = new Product("S60", "Volvo", 160000);
        products[2] = new Product("A6", "Audi", 320000);

        String fileName = "bazaProduktow.csv";
        File file = new File(fileName);

//        try (
//                var fileWriter = new FileWriter(fileName);
//                var writer = new BufferedWriter(fileWriter);
//        ) {
//            for (Product p : products) {
//                writer.write(p.name);
//                writer.write(" ");
//                writer.write(p.producer);
//                writer.write(" ");
//                writer.write(String.valueOf(p.price));
//                writer.newLine();
//            }
//
//        } catch (IOException e) {
//            System.err.println("Nie udalo sie zapisac ppliku " + fileName);
//        }


        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            for (Product p : products) {
                os.writeObject(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Product[] products1 = new Product[3];

//        try (
//                var fileReader = new FileReader(fileName);
//                var reader = new BufferedReader(fileReader);
//        ) {
//            String nextLine = null;
//            int linesNo = 0;
//            while ((nextLine = reader.readLine()) != null) {
//                System.out.println(nextLine);
//                linesNo++;
//            }
//
//
//        } catch (IOException e) {
//            System.err.println("Brak danych");
//        }

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
                ){
            int lineNo = 0;
            Product nextLine;
            while ((nextLine = (Product) ois.readObject()) != null){
                products1[lineNo] = nextLine;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
