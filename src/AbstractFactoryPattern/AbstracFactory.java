package AbstractFactoryPattern;

public abstract class AbstracFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
