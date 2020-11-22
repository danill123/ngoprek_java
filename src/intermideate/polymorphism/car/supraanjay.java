package intermideate.polymorphism.car;

public class supraanjay extends Car {
    public supraanjay(String color, int vehicleowners, short cubiccapacity) {
        super("Toyota Gondal gandul", 2, (short) 90);
    }

    @Override
    public void startEngine() {
        System.out.println("udah mulai nih supra anjim");
    }
}
