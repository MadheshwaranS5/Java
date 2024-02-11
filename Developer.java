public class Developer extends manager{
    
    @Override
    public void calculateBonus() {
        super.calculateBonus();

        System.out.println("Bonus for Developers 5000");
        int bonus_salary = salary+5000;

        System.out.println("The Bonus and Salary of Developers is "+bonus_salary);
    }

    public static void main(String[] args) {
        
        Developer d = new Developer();
        d.calculateBonus();
    }
}

class employee{

    String name = "Madheshwaran";
    int salary = 20000;

    public void calculateBonus(){
        System.out.println("Bonus calculation is different for manager and developer");
    }
}

class manager extends employee{

    @Override
    public void calculateBonus() {
        super.calculateBonus();

        System.out.println("for managers bonus is ten thousand");
        int bonus_salary = salary + 10000;

        System.out.println("The Bonus and Salary of Managers is "+bonus_salary);
    }
}
