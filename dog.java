public class dog extends Animal{
    
    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        name = "dog";
        sound = "Bow";

        super.makeSound();
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.makeSound();
    }

}
