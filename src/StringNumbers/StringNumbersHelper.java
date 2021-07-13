package StringNumbers;

public class StringNumbersHelper {

    public static int String2Int(String str) {
        int a = 0;
        try {
            int res = Integer.parseInt(str);
            return res;
        } catch (Exception e) {
            System.out.println(e.toString());
            return a;
        }
    }

    public static double String2Double(String str) {
        int a = 0;
        try {
            double res = Double.parseDouble(str);
            return res;
        } catch (Exception e) {
            System.out.println(e.toString());
            return a;
        }
    }
    
    public static String Int2String(int number)
    {
        String str=String.valueOf(number);
        return str;
    }
    
    public static String Double2String(double number)
    {
        String str=String.valueOf(number);
        return str;
    }
    
}
