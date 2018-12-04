import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Name: " +  rectangle.getName());
        Colored colored = (Colored) rectangle;
        System.out.println("Colored: " + colored);
        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape);
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle);
//        rectangles.add(colored); can not add colored or shape because they are not  Rectangles any more!
        System.out.println(rectangles);

        List<Colored> coloreds = new ArrayList<>();
        System.out.println(coloreds.add(colored));
        System.out.println(coloreds.add(rectangle));

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);
        shapes.add(rectangle);
        System.out.println(shapes);


    }
}
