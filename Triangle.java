public class Triangle extends Shape{
    
    @Override
    public void calculateArea() {
        super.calculateArea();

        float area_shape =(float) (width*height)/2;

        System.out.println("Area of triangle: "+area_shape);
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.calculateArea();
    }
}
