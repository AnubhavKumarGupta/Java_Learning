abstract class Shape {
    double x;
    double y;
    Shape(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    abstract void display();
 }
class Rectangle extends Shape {
    Rectangle(double x, double y) {
        super(x, y);
    }
    double calculateArea() {
        return x * y;
    }
    void display() {
        System.out.println("Rect :" + calculateArea());
    }
}
class Triangle extends Shape {
    double z;
    Triangle(double x, double y) {
        super(x, y);
    }
    Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    double calculateArea() {
        if(z == 0)
            return 0.5 * x * y;
        double s = (x + y + z) * 0.5;
        return Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }
    void display() {
        System.out.println("Tri: " + calculateArea());
    }
}
class Main1
{
    public static void main(String as[])
    {
        Rectangle ob2 = new Rectangle(5, 7);
        ob2.display();
        Triangle ob3 = new Triangle(13, 15);
        ob3.display();
        Triangle ob4 = new Triangle(13, 15, 10);
        ob4.display();
    }
}

