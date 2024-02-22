import java.util.Scanner;

public class circle {
    private float radius;
    private float area;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        radius = sc.nextFloat(); 
        
    }

    public void calculateArea() {
        area = (float) (Math.PI * Math.pow(radius, 2));
    }

    public void showData() {
        System.out.println("Radius of the circle is: " + radius);
        System.out.println("Area of the circle is: " + area);
    }
}


