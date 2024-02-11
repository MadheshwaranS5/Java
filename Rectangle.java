public class Rectangle extends Triangle{

    @Override 
    public void calculateArea() {
        super.calculateArea();

        int area_shape = width *height;
        System.out.println("The area of Rectangle: "+area_shape);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculateArea();
    }
}

class Triangle extends Shape{
    
    @Override
    public void calculateArea() {
        super.calculateArea();

        float area_shape =(float) (width*height)/2;

        System.out.println("Area of triangle: "+area_shape);
    }
}

