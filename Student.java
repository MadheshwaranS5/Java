public class Student extends Person{
    
    @Override
    public void introduce() {
        super.introduce();

        char grade = 'A';
        System.out.println("My grade is "+grade);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.introduce();
    }
}

class Person{

    public void introduce(){
        String name = "Madhesh";
        int age = 24;

        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
}
