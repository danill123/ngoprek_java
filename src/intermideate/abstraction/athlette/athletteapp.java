package intermideate.abstraction.athlette;

public class athletteapp {
    public static void main(String[] args) {
        Swimmer katinka = new Swimmer("katinka tested", "i'm ladu", 12321, "bacor", 213213);
        // String name, String nickname, int yearOfBorn, String team, int finalpoint
        katinka.freestyle();
        katinka.getBodyType();
    }
}
