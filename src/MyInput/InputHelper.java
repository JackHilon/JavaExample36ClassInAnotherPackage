
package MyInput;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InputHelper {
    
    public static Scanner myIn =new Scanner(System.in);
    
    public static int GetInteger() {
        int res=0;
        try{
            res=myIn.nextInt();
            if(res<=0)
                throw new InputMismatchException();
            myIn.nextLine();
            return res;
        }catch(Exception e)
        {
            myIn.nextLine();
            return GetInteger();
        }
    }// end GetInteger()
    
    public static double GetDouble() {
        double res=0;
        try{
            res=myIn.nextDouble();
            if(res<=0)
                throw new InputMismatchException();
            myIn.nextLine();
            return res;
        }catch(Exception e)
        {
            myIn.nextLine();
            return GetDouble();
        }
    }// end GetDouble()
    
}
