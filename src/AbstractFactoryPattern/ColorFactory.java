package AbstractFactoryPattern;

public class ColorFactory extends AbstracFactory {
    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("BLACK")){
            return new Black();
        }else if (color.equalsIgnoreCase("GREEN")){
            return new Greeen();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
