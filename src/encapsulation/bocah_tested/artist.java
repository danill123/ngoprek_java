package encapsulation.bocah_tested;

public class artist extends younglex implements lagu{
    public static void main(String[] args) {
        System.out.println("siapa bae dah artisnya");
    }

    @Override
    public void nyanyicuk() {
        System.out.println("sae lau");
    }

    @Override
    public String jargon() {
        return "Suaranya anjay A N J A Y";
    }

    @Override
    public Integer team() {
        return 12;
    }
}
