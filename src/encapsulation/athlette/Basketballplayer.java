package encapsulation.athlette;

import java.util.Random;

public class Basketballplayer {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;

    private double freeThrowPercentage;
    private double pointsPerGame;
    private int gamesPLayed;

    public Basketballplayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPLayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPLayed = gamesPLayed;
    }

    public void freeThrow() {
        Random randomnumbergenerate = new Random();
        if(randomnumbergenerate.nextDouble() * 100 > freeThrowPercentage) {
            System.out.println(name + " failed to score free throw ");
        } else {
            System.out.println(name + " free throw ");
        }
    }

}
