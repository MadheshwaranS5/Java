public class Car extends Vehicle{
    
    @Override
    public void displayinfo() {
        String brand = "Lamborghini";
        System.out.println("Car brand: "+brand);
        super.displayinfo();
    }

    public static void main(String[] args) {
        
        Car c = new Car();
        c.displayinfo();
    }
}

class Vehicle{

    public void displayinfo(){
        int speed = 160;
        int fuel_capacity = 40;

        System.out.println("Maximum speed of car: "+speed+" Km.");
        System.out.println("Fuel Capacity of car: "+fuel_capacity+" liters.");
    }
}