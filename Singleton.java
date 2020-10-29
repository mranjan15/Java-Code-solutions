public class Singleton {
    private static volatile Singleton instance; //volatile helps to sure threads handle Singleton instance correctly
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c);
    }

}
