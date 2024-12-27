public class Q7 {
    public static void main(String[] args) {
        String s = new String("core");
        String s1 = s.concat("java");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        StringBuffer sb = new StringBuffer("core");
        StringBuffer sb1 = sb.append("java");
        System.out.println(sb.hashCode());
        System.out.println(sb1.hashCode());

    }
}
