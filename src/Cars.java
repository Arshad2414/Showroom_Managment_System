import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_feul_type;
    int car_price;
    String car_type;
    String car_transmission;

    public void get_details(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FEUL TYPE: "+car_feul_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("CAR TRANSMISSION: "+car_transmission);
    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================  **** ENTER CAR DETAILS **** =============================");
        System.out.println();
        System.out.println("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.println("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.println("FUEL TYPE (PETROL/DESILE): ");
        car_feul_type = sc.nextLine();
        System.out.println("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("CAR TYPE (SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.println("TRANSMISSION TYPE (AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_in_stocks++;


        System.out.println("\n ENTERED DETAILS");
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FEUL TYPE: "+car_feul_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("CAR TRANSMISSION: "+car_transmission);

        boolean needCorrection = true;
        while (needCorrection) {
            System.out.println("\n DO YOU WANT TO CORRECT ANY FEILD? (Y/N)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Enter the field number to correct (1-Car Name, 2-Car Color, 3-Car Fuel Type, 4-Car Type (SEDAN/SUV/HATCHBACK), 5-Car Transmission (Automatic/Manual)): ");
                int fieldToCorrect=sc.nextInt();
                sc.nextLine();
                switch (fieldToCorrect) {
                    case 1:
                            System.out.println("CAR NAME: ");
                            car_name=sc.nextLine();
                        break;
                    case 2:
                            System.out.println("CAR COLOR: ");
                            car_color=sc.nextLine();
                        break;
                    case 3:
                    System.out.println("CAR FUEL TYPE (PETROL/DESILE)");
                    car_feul_type=sc.nextLine();
                        break;
                
                    case 4:
                    System.out.println("CAR TYPE (SEDAN/SUV/HATCHBACK): ");
                    car_type=sc.nextLine();
                        break;
                    case 5:
                    System.out.println("CAR TRANSMISSION (AUTOMATIC/MANUAL)");
                    car_transmission=sc.nextLine();
                        break;
                
                    default:
                    System.out.println("Invalid field number!");
                        break;
                }
                System.out.println("\nUPDATE DETAILS: ");
                System.out.println("NAME: "+car_name);
                System.out.println("COLOR: "+car_color);
                System.out.println("FUEL TYPE : "+car_feul_type);
                System.out.println("CAR TYPE : "+car_type);
                System.out.println("TRANSMISSION : "+car_transmission);
        
                }else{
                    needCorrection = false;
                }
            }
        }

        public String getObjectName(Object obj){
            if (obj instanceof Cars) {
                return ((Cars)obj).car_name.toUpperCase();
            }
            return obj.toString();
        }
    
    }

