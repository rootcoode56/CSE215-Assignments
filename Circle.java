public class Circle implements GeoObj{
    private double Radius;

    public Circle(double Radius){
        this.Radius = Radius;
    }

    @Override
    public double area() {
        return Math.PI*Radius*Radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI* Radius;
    }
}
