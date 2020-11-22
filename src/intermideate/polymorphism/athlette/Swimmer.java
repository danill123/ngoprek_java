package intermideate.polymorphism.athlette;

import org.w3c.dom.ls.LSOutput;

public class Swimmer extends athlete implements Swimming{
    public Swimmer(String name, String nickname, int yearOfBorn, String team) {
        super(name, nickname, yearOfBorn, team);
    }

    @Override
    public void freestyle() {
        System.out.println("free style");
    }

    @Override
    public void freestyle(int distance) {
        System.out.println("distance " + distance);
    }
}
