package intermideate.abstraction.car;

public class DodgeChallanger extends Car implements Electricmode{

    public DodgeChallanger(String color, int vehicleowners, short cubiccapacity) {
        super(color, vehicleowners, cubiccapacity);
    }

    @Override
    public void startEngine() {
        System.out.println("bacot anjim mulai mesinnya");
    }

    @Override
    public void starTheELectricEngine() {
        System.out.println("Dodge Chalanger start with electric engine");
    }
}
