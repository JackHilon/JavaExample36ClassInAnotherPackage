
package MyMath;


public class MathHelper {
    
    public static int NegativeInt(int a)
    {
        int b=Math.abs(a);
        int c=-1*b;
        return c;
    }
    
    public static double NegativeDouble(double a)
    {
        double b=Math.abs(a);
        double c=-1*b;
        return c;
    }
    
    public static long RoundToTheNearestInteger(double a)
    {
        long res =Math.round(a);
        return res;
    }
    
    public static long RoundToTheHigherNearestInteger(double a)
    {
        long res =(long)Math.ceil(a);
        return res;
    }
    
    public static long RoundToTheLowerNearestInteger(double a)
    {
        long res =(long)Math.floor(a);
        return res;
    }
}
