package JavaStart10.homework.komputerZPodzespolami;

public class Computer {

    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;

    public Computer(Processor processor, Ram ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    @Override
    public String toString() {
        return "ComputerToUse{" +
                processor +
                ram +
                hardDrive;
    }
}
