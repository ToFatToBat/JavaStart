package JavaStart10.homework.komputerZPodzespolami;

public abstract class Computer {
   private String model;
    private String producer;
    private String serialNo;

    public Computer(String model, String producer, String serialNo) {
        this.model = model;
        this.producer = producer;
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return  "model= " + model + '\n' +
                "producer= " + producer + '\n' +
                "serialNo= " + serialNo + '\n';
    }
}
