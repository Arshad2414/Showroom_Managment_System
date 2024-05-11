import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;


    public void get_details(){
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("=============================  **** ENTER EMPLOYEE DETAILS **** =============================");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
        emp_name=sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.println("SHOWROOM NAME: ");
        showroom_name=sc.nextLine();

        System.out.println("\n ENTERD DETAILS");
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);

        boolean needCorrection = true;
        while (needCorrection) {
            System.out.println("\n DO YOU WANT TO CORRECT ANY FEILD? (Y/N)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Enter the field number to correct (1-Employee Name, 2-Employee Age, 3-Employee Department): ");
                int fieldToCorrect = sc.nextInt();
                sc.nextLine();
                switch (fieldToCorrect) {
                    case 1:
                    System.out.println("ENTER CORRECT EMPLOYEE NAME: ");
                    emp_name=sc.nextLine();
                    break;
            
                case 2:
                    System.out.println("ENTER CORRECT EMPLOYEE AGE: ");
                    emp_age=sc.nextInt();   
                    sc.nextLine();
                    break;
            
                case 3:
                    System.out.println("ENTER CORRECT EMPLOYEE DEPARTMENT: ");
                    emp_department=sc.nextLine();
                    break;
            
                default:
                System.out.println("Invalid field number!");
                }

                System.out.println("\n UPDATED DETAILS");
                System.out.println("ID: "+emp_id);
                System.out.println("Name: "+emp_name);
                System.out.println("Age: "+emp_age);
                System.out.println("Department: "+emp_department);

            }else{
                needCorrection = false;
            }
        }

    }
    public String getObjectName(Object obj){
        if (obj instanceof Employees) {
            return ((Employees)obj).emp_name.toUpperCase();
        }
        return obj.toString();
    }
}
