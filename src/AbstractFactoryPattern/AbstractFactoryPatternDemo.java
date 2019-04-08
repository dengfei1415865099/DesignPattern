package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstracFactory shapeFactory = FactoryProducer.getAbstractFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        AbstracFactory colorFactory = FactoryProducer.getAbstractFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();
    }
}
