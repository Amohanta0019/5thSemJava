public class Q3 {
    public static void main(String[] args) {
        try{
            int[] a = new int[-5];
        }catch(NegativeArraySizeException nase){
            System.out.println("array size cannot be -ve");
        }
    }
}
