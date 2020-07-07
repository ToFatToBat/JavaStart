package JavaStart10.homework.pojazdyWypozyczalnia;

public enum Direction {
    LEFT("lewo"), RIGHT("prawo"), FORWARD("do przodu"), BACK("do tylu");

    String directionMovement;

    Direction(String directionMovement) {
        this.directionMovement = directionMovement;
    }
}
