public class Rectangle extends GeometricObject implements ExceptionInterface{
    private double width;
    private double height;

    public Rectangle(double width, double height) throws Exception{
        setWidth(width);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setWidth(double width) throws Exception {
        if (width<0){
            throw new Exception("Width cannot be negative");
        }
        this.width= width;
    }

    @Override
    public void setHeight(double height) throws Exception {
        if(height<0){
            throw new Exception("Height cannot be negative");
        }
        this.height= height;
    }

    public double getArea(){
        return width* height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}
