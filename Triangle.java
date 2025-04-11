import java.util.*;
public class Triangle implements GeoObj{
    private final double base;
    private final double height;
    private final double other_side;

    public Triangle(double base, double height, double other_side){
        this.base=base;
        this.height=height;
        this.other_side=other_side;
    }

    public double perimeter() {
        return base+height+other_side;
    }

    public double area() {
        double semi_perimeter = (base+height+other_side) / 2;
        return Math.sqrt(semi_perimeter*(semi_perimeter-base)*(semi_perimeter-height)*(semi_perimeter-other_side));
    }
}
