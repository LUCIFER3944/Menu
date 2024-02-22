import java.util.Scanner;

public class square {
    private float side;
    private float area;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side length of the square:");
        side = sc.nextFloat();
    }

    public void calculateArea() {
        area = side * side;
    }

    public void showData() {
        System.out.println("Side length of the square is: " + side);
        System.out.println("Area of the square is: " + area);
    }
}

