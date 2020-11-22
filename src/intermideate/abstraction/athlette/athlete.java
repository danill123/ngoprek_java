package intermideate.abstraction.athlette;

public abstract class athlete {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;

    private double freeThrowPercentage;
    private double pointsPerGame;
    private int numberOfCompetition;

    public athlete(String name, String nickname, int yearOfBorn, String team) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getBio() {
        System.out.println(name + " " + nickname);
        System.out.println("yearborn in " + yearOfBorn);
    }

    public void compete() {
        System.out.println("compete running");
    }

    public abstract String getBodyType();
}
