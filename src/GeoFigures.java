public class GeoFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площа кола: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(6, 4);
        System.out.println("Площа трикутника: " + triangle.calculateArea());
    }
}