package javaexample36classinanotherpackage;

import MyCharacters.CharactersHelper;
import MyInput.InputHelper;
import MyMath.*;
import StringNumbers.StringNumbersHelper;

public class JavaExample36ClassInAnotherPackage {

    public static void main(String[] args) {

        System.out.print("Enter your first int number: ");
        int a = InputHelper.GetInteger();
        System.out.print("Enter your second int number: ");
        int b = InputHelper.GetInteger();

        System.out.print("Enter your first double number: ");
        double c = InputHelper.GetDouble();
        System.out.print("Enter your second double number: ");
        double d = InputHelper.GetDouble();

        MySpace();

        SimpleMathPart(a, b, c, d);
        
        AdvancedMathPart(a, b, c, d);
        
        TrigonometryPart(a, b, c, d);
        
        RandomNumbersPart();
        
        StringNumbersPart(a, d);
        
        CharPart();

    }
    
    private static void CharPart()
    {
        char whiteSpace=' ';
        char hash='#';
        char r='r';
        char T='T';
        char one='1';
        char plus='+';
        char questionMark='?';
        char[] myCharsTest=new char[] {whiteSpace, hash,r,T,one,plus,questionMark};
        
        char temp;
        for (int i = 0; i < myCharsTest.length; i++) {
            temp=myCharsTest[i];
            System.out.println(temp+" is a digit: "+CharactersHelper.IsDigit(temp));
            System.out.println(temp+" is a letter: "+CharactersHelper.IsLetter(temp));
            System.out.println(temp+" is a letter or a digit: "+CharactersHelper.IsLetterOrDigit(temp));
            System.out.println(temp+" is in the lower case: "+CharactersHelper.IsLowerCase(temp));
            System.out.println(temp+" is in the upper case: "+CharactersHelper.IsUpperCase(temp));
            System.out.println(temp+" is a white-space : "+CharactersHelper.IsWhiteSpace(temp));
            System.out.println("The upper case of ("+temp+"): "+CharactersHelper.Convert2UpperCase(temp));
            System.out.println("The lower case of ("+temp+"): "+CharactersHelper.Convert2LowerCase(temp));
            System.out.println("The title case of ("+temp+"): "+CharactersHelper.Convert2TitleCase(temp));
        }
        
        MySpace();
    }
    private static void SimpleMathPart(int a,int b, double c, double d)
    {
        System.out.println("Negative of the first int is: " + MathHelper.NegativeInt(a));
        System.out.println("Negative of the second double is: " + MathHelper.NegativeDouble(d));
        System.out.println("Round the first double to the nearest int: " + MathHelper.RoundToTheNearestInteger(c));
        System.out.println("Round the first double to the higher nearest int: " + MathHelper.RoundToTheHigherNearestInteger(c));
        System.out.println("Round the first double to the lower nearest int: " + MathHelper.RoundToTheLowerNearestInteger(c));
        System.out.println("Round 3.2 to the nearest int: " + MathHelper.RoundToTheNearestInteger(3.2));
        System.out.println("Round 3.5 to the nearest int: " + MathHelper.RoundToTheNearestInteger(3.5));
        System.out.println("Round 3.8 to the nearest int: " + MathHelper.RoundToTheNearestInteger(3.8));
        
        MySpace();
    }
    
    private static void AdvancedMathPart(int a, int b, double c, double d)
    {
        System.out.println("The first int root of degree 3 is: "+AdvancedMathHelper.Root(a, 3));
        System.out.println("The first double root of degree 4 is: "+AdvancedMathHelper.Root(c, 4));
        System.out.println("The first int powered to the second int is: "+AdvancedMathHelper.Power(a, b));
        System.out.println("The first double powered to the first int is: "+AdvancedMathHelper.Root(c, a));
        System.out.println("The natural logarithm of the second int is: "+AdvancedMathHelper.LogE(b));
        System.out.println("The natural logarithm of the second double is: "+AdvancedMathHelper.LogE(d));
        
        MySpace();
    }
    
    private static void TrigonometryPart(int a, int b, double c, double d)
    {
        System.out.println("Convert the first double to degree: "+ConvertAngle.Convert2Degree(d));
        System.out.println("Convert the second double to radian: "+ConvertAngle.Convert2Radian(d));
        System.out.println("The Sin value of first int: "+Trigonometry.Sin(a));
        System.out.println("The Cos value of second int: "+Trigonometry.Cos(b));
        System.out.println("The Tan value of first double: "+Trigonometry.Tan(c));
        System.out.println("The ASin value of second double: "+Trigonometry.Sin(d));
        System.out.println("The ACos value of first int: "+Trigonometry.ACos(a));
        System.out.println("The ATan value of first double: "+Trigonometry.ATan(c));
        System.out.println("The special ATan value of (x: first int, y: second int): "+Trigonometry.SpecialATan(a,b));
        System.out.println("The special ATan value of (x: second double, y: first double): "+Trigonometry.SpecialATan(d,c));
        
        MySpace();
    }
    
    private static void RandomNumbersPart()
    {
        System.out.println("a Random Double Exclusive Limit (5) is: "+MyRand.RandomDoubleExclusiveLimit(5));
        System.out.println("a Random int Exclusive Limit (20) is: "+MyRand.RandomIntExclusiveLimit(20));
        System.out.println("a Random Double Inclusive Limit (300) is: "+MyRand.RandomDoubleInclusiveLimit(300));
        System.out.println("a Random int Inclusive Limit (15) is: "+MyRand.RandomIntInclusiveLimit(15));
        
        MySpace();
    }
    
    private static void StringNumbersPart(int a, double d)
    {
        System.out.println("The string that represents the first int is: "+StringNumbersHelper.Int2String(a));
        System.out.println("The string that represents the second double is: "+StringNumbersHelper.Double2String(d));
        System.out.println("The int value of the string \"987\" is: "+StringNumbersHelper.String2Int("987"));
        System.out.println("The dooble value of the string \"12.3\" is: "+StringNumbersHelper.String2Double("12.3"));
        System.out.println("The dooble value of the string \"83,7\" is: "+StringNumbersHelper.String2Double("83,7"));
        System.out.println("The int value of the string \"abcd\" is: "+StringNumbersHelper.String2Int("abcd"));
        
        MySpace();
    }
    
    private static void MySpace()
    {
        System.out.println();
        System.out.println();
        System.out.println("---");
    }

}
