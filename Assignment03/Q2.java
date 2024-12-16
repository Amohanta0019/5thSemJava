class Box {
    Box(double length, double bredth, double height){
        System.out.println("Cube vol = "+ length*bredth*height);
    }
    Box(double radius, double height){
        System.out.println("cone vol = "+0.33*Math.PI*radius*radius*height);
    }
    
}
public class Q2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Box cube = new Box(10, 10, 10);
        Box cone = new Box(10, 10);    
    }
    
}
