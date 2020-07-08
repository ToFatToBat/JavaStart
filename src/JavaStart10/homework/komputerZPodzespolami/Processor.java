package JavaStart10.homework.komputerZPodzespolami;

public class Processor extends Computer implements Overclocking {
    private int mhz;
    private int temp;
    private int maxTemp;

    public Processor(String model, String producer, String serialNo, int mhz, int temp, int maxTemp) {
        super(model, producer, serialNo);
        this.mhz = mhz;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }
    @Override
    public void overclocking(int mhzIncrease) {
        if ((temp + tempIncrease(mhzIncrease)) > maxTemp) {
            System.out.println("Niemozliwe podkrecenie, za wysoka temperatura procesora po podkreceniu.");
        } else {
            mhz += mhzIncrease;
            temp += tempIncrease(mhzIncrease);
        }
    }

    @Override
    public int tempIncrease(int mhzIncrease) {
        return (mhzIncrease / 100 * 10);

    }

    @Override
    public String toString() {
        return "Procesor: " + '\n' +
                super.toString() +
                "Procesor MHz= " + mhz + '\n' +
                "temperature= " + temp + '\n' +
                "Max Temperature=" + maxTemp + '\n';
    }
}
