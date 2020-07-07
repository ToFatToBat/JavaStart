package JavaStart10.homework.pojazdyWypozyczalnia;

public class RentableCar extends Car implements Moveable, Rentable {

    private boolean isCarRentedBySomeone = false;

    public RentableCar(String name, int year, int seatNo) {
        super(name, year, seatNo);
    }

    @Override
    public String rent(Person person) {
        System.out.println("Auto zostało wypozyczone przez " + person.toString());
        setCarRentedBySomeone(true);
        return null;
    }

    @Override
    public String handOver() {
     setCarRentedBySomeone(false);
     return null;
    }

    @Override
    public boolean isRent() {
        return isCarRentedBySomeone();

    }

    public boolean isCarRentedBySomeone() {
        return isCarRentedBySomeone;
    }

    public void setCarRentedBySomeone(boolean carRentedBySomeone) {
        isCarRentedBySomeone = carRentedBySomeone;

    }
}
