package JavaStart10.homework.pojazdyWypozyczalnia;

public class Car extends Vehicle {

   private int seatNo;

    public Car(String name, int year, int seatNo) {
        super(name, year);
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }


    @Override
    public String toString() {
        return super.toString() + "seatNo=" + getSeatNo();

    }


}
