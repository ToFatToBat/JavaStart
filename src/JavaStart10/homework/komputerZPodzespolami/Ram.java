package JavaStart10.homework.komputerZPodzespolami;

public class Ram extends Hardware implements Overclocking {
    private int memoryAmount;
    private int mhz;
    private int temp;
    private int maxTemp;


    public Ram(String model, String producer, String serialNo, int memoryAmount, int mhz, int temp, int maxTemp) {
        super(model, producer, serialNo);
        this.memoryAmount = memoryAmount;
        this.mhz = mhz;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return "RAM: " + '\n' +
                super.toString() +
                "RAM memory amount= " + memoryAmount + '\n' +
                "mhz= " + mhz + '\n' +
                "temp= " + temp + '\n' +
                "maxTemp= " + maxTemp + '\n';
    }

    @Override
    public void overclocking(int mhzIncrease) {
        if ((temp + tempIncrease(mhzIncrease)) > maxTemp) {
            System.out.println("Niemozliwe podkrecenie, za wysoka temperatura RAM-u po podkreceniu.");
        } else {
            mhz += mhzIncrease;
            temp += tempIncrease(mhzIncrease);
        }
    }

    @Override
    public int tempIncrease(int mhzIncrease) {
       return (mhzIncrease / 100 * 15);

    }

}


