package JavaStart10.homework.pojazdyWypozyczalnia;

public class RentableCar extends Car implements Moveable, Rentable {

    private boolean isCarRentedBySomeone = false;

    public RentableCar(String name, int year, int seatNo) {
        super(name, year, seatNo);
    }

    @Override
    public void rent(Person person) {
        System.out.println("Auto zostało wypozyczone przez " + person.toString());
        isCarRentedBySomeone = true;
    }

    @Override
    public void handOver() {
     isCarRentedBySomeone = false;
    }

    @Override
    public boolean isRent() {
        return isCarRentedBySomeone;

    }

    public boolean isCarRentedBySomeone() {
        return isCarRentedBySomeone;
    }

    public void setCarRentedBySomeone(boolean carRentedBySomeone) {
        isCarRentedBySomeone = carRentedBySomeone;

    }
}
