package intermideate.abstraction.athlette;

import intermideate.abstraction.car.Swimming;

public class Swimmer extends athlete implements Swimming {

    private int finalpoint;
    public Swimmer(String name, String nickname, int yearOfBorn, String team, int finalpoint) {
        super(name, nickname, yearOfBorn, team);
        this.finalpoint = finalpoint;
    }

    @Override
    public String getBodyType() {
        return "gendut cot";
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("FINA points: ");
    }

    @Override
    public void freestyle() {
        System.out.println("gaya katak running bichies");
    }

    @Override
    public void compete() {
        super.compete();
        freestyle();
    }
}
