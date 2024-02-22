import java.util.Scanner;

public class rectangle {
    private float length;
    private float width;
    private float area;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        length = sc.nextFloat();

        System.out.println("Enter the width of the rectangle:");
        width = sc.nextFloat();
    }

    public void calculateArea() {
        area = length * width;
    }

    public void showData() {
        System.out.println("Length of the rectangle is: " + length);
        System.out.println("Width of the rectangle is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}


