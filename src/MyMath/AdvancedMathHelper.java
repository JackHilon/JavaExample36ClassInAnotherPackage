
package MyMath;


public class AdvancedMathHelper {
    
    
    public static final double PI=Math.PI;
    public static final double E=Math.E;
    
    public static double Root(double number, int degree)
    {
        double power=(double)1/degree;
        double res=Math.pow(number, power);
        return res;
    }
    
    public static double Root(int number, int degree)
    {
        double a=(double)number;
        double res=Root(a, degree);
        return res;
    }
    
    public static double Power(double number, int degree)
    {
        double res=Math.pow(number, degree);
        return res;
    }
    
    public static double Power(int number, int degree)
    {
        double a=(double)number;
        double res=Power(a, degree);
        return res;
    }
    
    public static double Exponential(double number)
    {
        double res=Math.pow(E, number);
        return res;
    }
    
    public static double Exponential(int number, int degree)
    {
        double a=(double)number;
        double res=Exponential(a);
        return res;
    }
    
    public static double LogE(double number)
    {
        double res=Math.log(number);
        return res;
    }
    
    public static double LogE(int number)
    {
        double a=(double)number;
        double res=LogE(a);
        return res;
    }
    
}
