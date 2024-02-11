import java.util.Scanner;

class add {
    static Scanner sc = new Scanner(System.in);

    public static void addition() {
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();

        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        System.out.println("The value of A+B: "+(a+b));
    }

}

class sub extends add{

    public static void subtraction(){
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();

        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        System.out.println("The value of A-B: "+(a-b));
    }
}

class multi extends sub{

    public static void multiply(){
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();

        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        System.out.println("The value of A multiply by B: "+(a*b));
    }
}

class div extends multi{
    
    public static void division(){
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();

        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        System.out.println("The value of a dived by b: "+(a/b));
    }
}

public class calculator extends div {

    public static void main(String[] args) {
        
        System.out.println("Choose the operation want to do:");
        System.out.print("Options--> 1.Add, 2.Sub, 3.Multi, 4.Div: ");
        int option = sc.nextInt();

        if (option==1) {
            addition();
        }
        else if (option==2) {
            
            subtraction();
        }
        else if (option==3) {
            multiply();
        }
        else if (option==4) {
            division();
        }
        else{
            System.out.println("Choose correct operations");
        }
    }
}

// a ->b 

// a and b is parent 
// class c extends a and b