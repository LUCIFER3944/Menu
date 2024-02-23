import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        circle c= new circle();
        rectangle r=new rectangle();
        square s=new square();
        System.out.println("Choose a shape: ");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                s.getData();
                s.calculateArea();
                s.showData();
                break;
            case 2:
                r.getData();
                r.calculateArea();
                r.showData();
                break;
            case 3:
                c.getData();
                c.calculateArea();
                c.showData();
                break;
            default:
                System.err.println("Please enter a valid menu option!");
        }

        sc.close(); 
    }
        }
    










