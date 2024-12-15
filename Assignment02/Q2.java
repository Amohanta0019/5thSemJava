
//Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input.
import java.util.Scanner;

class Cylinder {
    double radius;
    double height;

    // Constructor to initialize using command-line arguments
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the surface area of a cylinder
    double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate the circumference of the base of the cylinder
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Cone {
    double radius;
    double height;

    // Constructor to initialize using command-line arguments
    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the surface area of a cone
    double getSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Method to calculate the circumference of the base of the cone
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius :-");
        double radius = sc.nextDouble();
        System.out.println("enter height :-");
        double height = sc.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        Cone cone = new Cone(radius, height);

        System.out.println("Cylinder Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Cylinder Circumference: " + cylinder.getCircumference());

        System.out.println("Cone Surface Area: " + cone.getSurfaceArea());
        System.out.println("Cone Circumference: " + cone.getCircumference());

        sc.close();
    }
}
