package intermideate.polymorphism.car;

public class Car {
    private int numberOfFollowers = 10;
    private byte numberOfSeats = 4;
    private byte emissionSticker = 4;
    private byte numberOfDoors = 2;

    private short power = 342;
    private short horsePower = 492;
    private short co2EMission = 492;
    private short cubicCpacity = 6417;
    private int price = 2999;
    private int mileage = 14999;

    private long registrationNumber = 12321323123231L;

    private float fuelConsumtionCombined = 15.5F;
    private float fuelConsumptionUrban = 15.5F;
    private float fuelConsumptionExtraUrban = 13.6F;

    private double fuelConsumptionPreciseAverage = 1523321323;

    private boolean isDamage = true;
    private char energyEfficientCategory = 'G';

    private String color;
    private String Carname;

    Car(String color, int vehicleowners, short cubiccapacity) {
        this.color = color;
        this.cubicCpacity = cubiccapacity;
        System.out.println("Dodge challanger is created and the color " + this.color);
        System.out.println("Cubic capacity " + this.cubicCpacity);
    }

    public void startEngine() {
        System.out.println("The engine is started");
    }

    public void getDescription() {
        System.out.println("nice car dude");
    }

    public int getDescription(int value) {
        return value;
    }

}
