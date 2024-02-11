public class rectanglee extends shape {

    @Override
    public void draw() {
        shape = "Rectangle";
        color = "red";
        super.draw();
    }
    public static void main(String[] args) {
        rectanglee r = new rectanglee();
        r.draw();
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


