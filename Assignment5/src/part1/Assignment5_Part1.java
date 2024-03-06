package part1;

public class Assignment5_Part1 {
    public static void main(String[] args) {
        Circle c=new Circle(7);
        System.out.println("For a circle with radius 7 units : ");
        System.out.printf("Area is %.2f%n", c.calculateArea());
        System.out.printf("Perimeter is %.2f%n", c.calculatePerimeter());

        Triangle t = new Triangle(1, 3, 7);
        System.out.println("For a triangle with sides 1, 3, and 7 units : ");
        System.out.printf("Area is %.2f%n", t.calculateArea());
        System.out.printf("Perimeter is %.2f%n", t.calculatePerimeter());

        Rectangle r = new Rectangle(3, 7);
        System.out.println("For a rectangle with sides 3 and 7 units : ");
        System.out.printf("Area is %.2f%n", r.calculateArea());
        System.out.printf("Perimeter is %.2f%n", r.calculatePerimeter());
    }
}
