import Shape.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.RECTANGLE);
        System.out.println(shape.draw());
    }
}
