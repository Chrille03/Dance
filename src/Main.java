import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dancer> Dance = new ArrayList<>();
        Dance.add(new BreakDancer());
        Dance.add(new ElectricBoogieDancer());

        for (Dancer dancer : Dance){
            dancer.dance();
        }
    }
}