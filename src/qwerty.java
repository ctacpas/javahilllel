/**
 * Created by User on 19.05.2018.
 */
public class qwerty {
    public static void main (String[]args) {
   System.out.println(S(1,2));
   System.out.println (S (7, 8));
   System.out.println (S (9, 10));
   System.out.println (X (5 ));
   System.out.println (X (-2 ));
   System.out.println (X (19 ));
   System.out.println (Sin(45));


    }
    public static double S (int a, int b) {                   //S и s
        double s = a*b;
        return s;}

        public static double X (double x) {
        double x2 = Math.pow(x,3)+ Math.pow (x,2) +1;
        return x2;}

        public static double Sin (double sin) {
         double si = Math.sin(2*Math.toRadians(sin));
         return si;}

    }
