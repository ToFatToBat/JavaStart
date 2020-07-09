package JavaStart10.homework.komputerZPodzespolami;

public class App {
    public static void main(String[] args) {
        Processor processor = new Processor("i9", "Intel", "09384509345M", 4500, 78, 100);
        Ram ram = new Ram("DDR4","Kingstone", "987459345HGFD", 16, 3400, 70, 116 );
        HardDrive hardDrive = new HardDrive("234234gt", "Samsung", "76532635fd", 2000);

        Computer computer = new Computer(processor, ram, hardDrive);

        System.out.println(computer.toString());
        System.out.println("---------------------");
        computer.getProcessor().overclocking(200);
        computer.getRam().overclocking(400);
        System.out.println(computer.toString());
        System.out.println("---------------------");
        computer.getProcessor().overclocking(100);
        System.out.println(computer.toString());
        System.out.println("---------------------");

    }
}
