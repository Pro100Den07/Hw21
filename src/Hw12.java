public class Hw12 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 100, 50, 80, "blue");
        Circle circle = new Circle(200, 200, 30, "red");
        Line line = new Line(50, 50, 200, 200, "green");

        rect.draw();
        circle.draw();
        line.draw();
    }
}

// Базовий клас для графічних об'єктів
abstract class GraphicObject {
    protected int x;
    protected int y;
    protected String color;

    public GraphicObject(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw();  // Абстрактний метод для малювання об'єкта
}

// Клас для прямокутників
class Rectangle extends GraphicObject {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a rectangle at (" + x + "," + y + ") with width " + width + ", height " + height + " and color " + color);
    }
}

// Клас для кол
class Circle extends GraphicObject {
    private int radius;

    public Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle at (" + x + "," + y + ") with radius " + radius + " and color " + color);
    }
}

// Клас для ліній
class Line extends GraphicObject {
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw() {
        System.out.println("Drawing a line from (" + x + "," + y + ") to (" + x2 + "," + y2 + ") with color " + color);
    }
}