import java.util.Scanner;
public class MAINGEO_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input For Triangle//
        System.out.println("Enter lengths of the sides of Triangle: ");
        double base = scanner.nextDouble();
        double height= scanner.nextDouble();
        double other_side = scanner.nextDouble();
        Triangle triangle = new Triangle(base,height,other_side);

        //Input For Circle//
        System.out.print("Enter radius of the circle: ");
        double Radius = scanner.nextDouble();
        Circle circle = new Circle(Radius);

        //Calculate and print area and perimeter of Triangle//
        System.out.println("Showing Triangle ");
        System.out.println("----------------------");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: "+ triangle.perimeter());

        //Calculate and print area and perimeter of Circle//
        System.out.println("Circle: ");
        System.out.println("----------------------");
        System.out.println("Area: "+circle.area());
        System.out.println("Perimeter: "+circle.perimeter());
    }
}
