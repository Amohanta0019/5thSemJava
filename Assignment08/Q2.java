public class Q2 {
    public static void main(String[] args){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[1]);
            String s = "java";
            System.out.println(s.charAt(5));
        }catch(ArrayIndexOutOfBoundsException aieob){
            aieob.printStackTrace();
        }
        catch(StringIndexOutOfBoundsException sioob){
            //sioob.printStackTrace();
            System.out.println("String Index Out Of Bounds Exception ");
        }
    }
}
