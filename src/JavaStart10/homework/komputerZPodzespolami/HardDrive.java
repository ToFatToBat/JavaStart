package JavaStart10.homework.komputerZPodzespolami;

public class HardDrive extends Hardware {
    private int size;

    public HardDrive(String model, String producer, String serialNo, int size) {
        super(model, producer, serialNo);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hard drive: " + '\n' +
                super.toString() +
                "HardDrive size= " + size + '\n';
    }
}
