package intermideate.classes;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallanger dodgechallanger = new DodgeChallanger("red", 2, (short) 1);
        dodgechallanger.startEngine();
        dodgechallanger.getDescription();

        DodgeChallanger testedanjay = new DodgeChallanger("yellow", 1, (short)3);
        testedanjay.getDescription();
        System.out.println(testedanjay.color);
        testedanjay.startEngine();
    }
}
