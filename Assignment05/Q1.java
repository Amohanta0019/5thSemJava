//Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of the two classes and calculate their area.

interface Shape{
    double pi = 3.14;
    double area();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return pi * radius * radius;
    }
}

class Rectangle implements Shape{
    double length;
    double bredth;
    Rectangle(double length,double bredth){
        this.length= length;
        this.bredth = bredth;
    }
    @Override
    public double area(){
        return length * bredth;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        System.out.println(c.area());

        Rectangle r = new Rectangle(4.5, 6.5);
        System.out.println(r.area());
    }
    
}