import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stocks = 0;
    String manager_name;
    public void get_details(){
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stocks: "+total_cars_in_stocks);
    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================  **** ENTER SHOWROOM DETAILS **** =============================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.println("TOTAL NO OF EMPLOYEES: ");
        total_employees=sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK: ");
        total_cars_in_stocks=sc.nextInt();
        sc.nextLine();


        System.out.println("\n ENTERED DETAILS");
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stocks: "+total_cars_in_stocks);

        boolean needCorrection = true;
        while (needCorrection) {
            System.out.println("\n DO YOU WANT TO CORRECTION: (Y/N)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Enter the field number to correct (1-Showroom Name, 2-Showroom Address, 3-Manager Name, 4-Total Employees, 5-Total Cars in Stock");
                int fieldToCorrect = sc.nextInt();
                sc.nextLine();

                switch (fieldToCorrect) {
                    case 1:
                    System.out.println("SHOWROOM NAME: ");
                    showroom_name = sc.nextLine();
                        break;
                    case 2:
                    System.out.println("SHOWROOM ADDRESS: ");
                    showroom_address = sc.nextLine();
                        break;
                    case 3:
                    System.out.println("MANAGER NAME: ");
                    manager_name = sc.nextLine();
                        break;
                    case 4:
                    System.out.println("TOTAL NO OF EMPLOYEES: ");
                    total_employees=sc.nextInt();
                    sc.nextLine();
                        break;
                    case 5:
                    System.out.println("TOTAL CARS IN STOCK: ");
                    total_cars_in_stocks=sc.nextInt();
                    sc.nextLine();
                        break;
                
                    default:
                    System.out.println("invalid number");
                       
                }

                System.out.println("\n UPDATED DETAILS");
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stocks: "+total_cars_in_stocks);

            }else{
                needCorrection = false;
            }
        }
    }
    @Override
    public String getObjectName(Object obj){
        if (obj instanceof Showroom) {
            return ((Showroom) obj).showroom_name.toUpperCase();
        }
        return obj.toString();
    }
}


