package JavaStart10.homework.komputerZPodzespolami;

public class ComputerToUse {

    Processor processor;
    Ram ram;
    HardDrive hardDrive;

    public ComputerToUse(Processor processor, Ram ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "ComputerToUse{" +
                processor +
                ram +
                hardDrive;
    }
}
