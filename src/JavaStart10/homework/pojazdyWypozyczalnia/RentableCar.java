package JavaStart10.homework.pojazdyWypozyczalnia;

public class RentableCar extends Car implements  Moveable, Rentable {

    public RentableCar(String name, int year, int seatNo) {
        super(name, year, seatNo);
    }

    @Override
    public String Rent() {
        return null;
    }

    @Override
    public boolean handOver() {
        return false;
    }

    @Override
    public boolean isRent() {
        return false;
    }
}
