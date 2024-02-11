
class Employee{

    public void displayinfo(){
        String name = "Madhesh";
        int salary = 10000;
        System.out.println("Name of Employee: "+name);
        System.out.println("Salary of Employee: "+salary);
    }
}


public class Manager extends Employee{

    
    @Override
    public void displayinfo() {
        super.displayinfo();
        String department = "Java Developer";
        System.out.println("Department of Employee: "+department);
    }

    public static void main(String[] args) {

        Manager m = new Manager();
        m.displayinfo();
        
    }

    
    
}
