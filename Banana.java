public class Banana extends Fruit{
    
    @Override
    public void displayinfo() {
        name = "Banana";
        super.displayinfo();
    }

    public static void main(String[] args) {
        Banana b = new Banana();
        b.displayinfo();
    }
}
