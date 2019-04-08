package ObserverPattern;

public class HexaBinary extends Observer {
    public HexaBinary(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexo Binary: "+Integer.toHexString(subject.getState()));
    }
}
