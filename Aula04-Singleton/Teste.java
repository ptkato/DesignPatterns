public class Teste {
    public static void main(String... args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println(Singleton.getSingleton().toString());
            }).start();
            new Thread(() -> {
                System.out.println(Singleton.getSingleton().toString());
            }).start();
        }
    }
}
