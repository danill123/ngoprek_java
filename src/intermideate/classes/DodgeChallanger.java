package intermideate.classes;

public class DodgeChallanger {
    private int numberOfFollowers = 10;
    byte numberOfSeats = 4;
    byte emissionSticker = 4;
    byte numberOfDoors = 2;

    short power = 342;
    short horsePower = 492;
    short co2EMission = 492;
    short cubicCpacity = 6417;
    int price = 2999;
    int mileage = 14999;

    long registrationNumber = 12321323123231L;

    float fuelConsumtionCombined = 15.5F;
    float fuelConsumptionUrban = 15.5F;
    float fuelConsumptionExtraUrban = 13.6F;

    double fuelConsumptionPreciseAverage = 1523321323;

    boolean isDamage = true;
    char energyEfficientCategory = 'G';

    String color;

    DodgeChallanger(String color, int vehicleowners, short cubiccapacity) {
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
}
