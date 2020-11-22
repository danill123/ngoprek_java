package encapsulation.car;

public class DodgeChallanger extends Car {

    public DodgeChallanger(String color, int vehicleowners, short cubiccapacity) {
        super(color, vehicleowners, cubiccapacity);
    }

    @Override
    public void startEngine() {
        System.out.println("bacot anjim mulai mesinnya");
    }
}
