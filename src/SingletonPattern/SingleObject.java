package SingletonPattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

     public static SingleObject getInstance() {
        return instance;
    }

    public void show(){
        System.out.println("Hello");
    }
}
