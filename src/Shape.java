// Базовый класс для геометрических фигур
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Круг
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Прямоугольник
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Квадрат (подкласс прямоугольника)
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    // Переопределение методов родительского класса
    @Override
    double calculateArea() {
        return getSide() * getSide();
    }

    @Override
    double calculatePerimeter() {
        return 4 * getSide();
    }

    // Новый метод для получения длины стороны
    public double getSide() {
        return getLength(); // Используем метод из родительского класса
    }

    private int getLength() {
        return 0;
    }
}
