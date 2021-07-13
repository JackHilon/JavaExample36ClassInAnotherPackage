
package MyMath;


public class Trigonometry {
    
    public static double Sin(double radian)
    {
        double res=Math.sin(radian);
        return res;
    }
    
    public static double Cos(double radian)
    {
        double res=Math.cos(radian);
        return res;
    }
    
    public static double Tan(double radian)
    {
        double res=Math.tan(radian);
        return res;
    }
    
    public static double ASin(double radian)
    {
        double res=Math.asin(radian);
        return res;
    }
    
    public static double ACos(double radian)
    {
        double res=Math.acos(radian);
        return res;
    }
    
    public static double ATan(double radian)
    {
        double res=Math.atan(radian);
        return res;
    }
    
    public static double SpecialATan(double x, double y)
    {
        double radian=Math.atan2(y,x);
        return radian;
    }
    
    
}
