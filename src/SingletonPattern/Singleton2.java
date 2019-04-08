package SingletonPattern;

public class Singleton2 {//饿汉式。线程安全
    private static Singleton2 instance = new Singleton2();
    private Singleton2(){}

    public static Singleton2 getInstance() {
        return instance;
    }
}
