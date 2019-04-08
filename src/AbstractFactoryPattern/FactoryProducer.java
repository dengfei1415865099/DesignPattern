package AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstracFactory getAbstractFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }return null;
    }
}
