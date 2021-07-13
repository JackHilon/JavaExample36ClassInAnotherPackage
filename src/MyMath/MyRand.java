
package MyMath;


public class MyRand {
    
    
    public static double RandomDoubleExclusiveLimit(int limit)
    {
        double res = (double) limit*Math.random();
        return res;
    }
    
    public static double RandomDoubleInclusiveLimit(int limit)
    {
        double res = (double) (limit+1)*Math.random();
        return res;
    }
    
    public static int RandomIntExclusiveLimit(int limit)
    {
        double res = RandomDoubleExclusiveLimit(limit);
        int result =(int) res;
        return result;
    }
    
    public static int RandomIntInclusiveLimit(int limit)
    {
        double res = RandomDoubleInclusiveLimit(limit);
        int result =(int) res;
        return result;
    }
}
