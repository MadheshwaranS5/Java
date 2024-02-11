public class Students extends Persons{
    
    @Override
    public void displayinfo() {
        super.displayinfo();

        char grade = 'A';
        System.out.println("Grade: "+grade);
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.displayinfo();
    }
}

class Persons{

    public void displayinfo(){

        String name = "Madheshwaran";
        String address = "India";

        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}
