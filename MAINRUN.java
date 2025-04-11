public class MAINRUN {
    public static void main(String[] args) {
        try {
            Rectangle r1 = new Rectangle(4, 5);
            Rectangle r2 = new Rectangle(-2, 3);

            GeometricObject geometricObject1 = r1;
            GeometricObject geometricObject2 = r2;
            System.out.println("Rectangle 1 area: " + geometricObject1.getArea());
            System.out.println("Rectangle 1 Perimeter: " + geometricObject1.getPerimeter());
            System.out.println("Rectangle 1 details: " + geometricObject1.toString());
            System.out.println();
            System.out.println("Rectangle 2 Area:" + geometricObject2.getArea());
            System.out.println("Rectangle 2 perimeter: " + geometricObject2.getPerimeter());
            System.out.println("Rectangle 2 details: " + geometricObject2.toString());
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
