package intermideate.inheritance.athlette;

public class footbal extends athlete{

    private int completions;
    private int passingYards;

    public footbal(String name, String nickname, int yearOfBorn, String team, int completions, int passingYards) {
        super(name, nickname, yearOfBorn, team);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("completion " + completions);
        System.out.println("passing yards " + passingYards);
    }
}
