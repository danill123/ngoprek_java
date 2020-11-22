package intermideate.polymorphism.athlette;

public class basketballapp {
    public static void main(String[] args) {
        Basketballplayer kobe = new Basketballplayer("Brian", "black maamba", 1978, "lakers", 83.7, 25.0, 1344);
        Basketballplayer jordan = new Basketballplayer("Jordan", "MJ", 1978, "lakers", 83.7, 25.0, 1344);
        Basketballplayer magic = new Basketballplayer("magic", "magic", 1978, "lakers", 83.7, 25.0, 1344);
        Basketballplayer[] basketballplayers = new Basketballplayer[3];
        basketballplayers[0] = kobe;
        basketballplayers[1] = jordan;
        basketballplayers[2] = magic;

        for (Basketballplayer basketballplayer : basketballplayers) {
            System.out.println("-----------------------");
            basketballplayer.freeThrow();
        }

        System.out.println("---- footbal player ------");
        footbal tomfotbal = new footbal("tom", "tm", 1992, "tested", 1, 1);
        tomfotbal.getBio();

        System.out.println(" --- swimmer ---");
        Swimmer n = new Swimmer("cot", "s", 1212, "tes");
        // String name, String nickname, int yearOfBorn, String team
        n.getBio();
        n.freestyle(12);
    }
}
