import Shape.Shape;
import Shape.Circle;
import Shape.Square;
import Shape.Rectangle;


public class ShapeFactory {
    private ShapeFactory(){}

    public static final Shape getShape(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("This shape type is unsupported");
        }
    }
}
