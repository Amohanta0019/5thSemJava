public class Q4 {
    public static void main(String[] args) {
        try{
            Object o = new Object();
            o = null;
            System.out.println(o.getClass());
        }catch(NullPointerException npe){
            System.out.println("Null reference");
        }    
    }
    
}
