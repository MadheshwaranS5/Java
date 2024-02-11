public class Apple extends Fruit{
    
    @Override
    public void displayinfo() {
        name = "Apple";
        super.displayinfo();
    }

    public static void main(String[] args) {
        Apple a = new Apple();
        a.displayinfo();
    }
}
