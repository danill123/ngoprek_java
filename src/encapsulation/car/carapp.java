package encapsulation.car;

public class carapp {
    public static void main(String[] args) {
        DodgeChallanger bacot = new DodgeChallanger("merah janda", 2,(short) 1);
        bacot.startEngine();

        System.out.println("-----------------");
        supraanjay sianjay = new supraanjay("b", 1, (short) 9);
        sianjay.startEngine();
        sianjay.getMileage();
    }

}
