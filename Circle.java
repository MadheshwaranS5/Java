public class Circle extends shape{
    
    @Override
    public void draw() {
        shape = "circle";
        color = "Blue";
        super.draw();
    }

    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.draw();
    }
}

class shape{

    String color;
    String shape;

    public void draw(){

        // color = "red";
        System.out.println("Drwaing the "+shape+" of color "+color);
    }
}


