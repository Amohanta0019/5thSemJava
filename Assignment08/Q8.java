public class Q8 {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("less args provided");
            }
            String s = args[0];
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);

            if (a < 0 || b > s.length() || a > b) {
                throw new StringIndexOutOfBoundsException("wrong index provided");
            } else {
                String s1 = s.substring(a, b);
                String s2 = new StringBuilder(s1).reverse().toString();
                System.out.println("Reverse String = " + s2);
            }
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println(sioobe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
