public class Rectangle implements Colored, Shape {
    @Override
    public String getColor() {
        return "Persian red";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
