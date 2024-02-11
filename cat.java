public class cat extends Animal{
    
    @Override
    public void makeSound() {
        name = "cat";
        sound = "Meow";
        super.makeSound();
    }
    public static void main(String[] args) {
        cat c = new cat();
        c.makeSound();
    }
}

class Animal{

    String name;
    String sound;
    public void makeSound(){
        System.out.println("Animal Name: "+name);
        System.out.println("Sound of Animal: "+sound);
    }
}
