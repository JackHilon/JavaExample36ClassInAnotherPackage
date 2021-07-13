
package MyCharacters;


public class CharactersHelper {
    
    //1
    public static boolean IsLetter(char a)
    {
        boolean res=Character.isLetter(a);
        return res;
    }
    
    //2
    public static boolean IsLowerCase(char a)
    {
        boolean res=Character.isLowerCase(a);
        return res;
    }
    
    //3
    public static boolean IsUpperCase(char a)
    {
        boolean res=Character.isUpperCase(a);
        return res;
    }
    
    //4
    public static boolean IsWhiteSpace(char a)
    {
        boolean res=Character.isWhitespace(a);
        return res;
    }
    
    //5
    public static boolean IsLetterOrDigit(char a)
    {
        boolean res=Character.isLetterOrDigit(a);
        return res;
    }
    
    //6
    public static boolean IsDigit(char a)
    {
        boolean res=Character.isDigit(a);
        return res;
    }
    
    public static char Convert2LowerCase(char a)
    {
        char res=Character.toLowerCase(a);
        return res;
    }
    
    public static char Convert2UpperCase(char a)
    {
        char res=Character.toUpperCase(a);
        return res;
    }
    
    public static char Convert2TitleCase(char a)
    {
        char res=Character.toTitleCase(a);
        return res;
    }
    
}
