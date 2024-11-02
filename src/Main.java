public class Main {
    public static void main(String[] args) {

        for (Transport t : Autopark.getAutopark()) {
            t.check();
        }
    }
}
