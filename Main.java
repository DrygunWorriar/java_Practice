public class Main
{
    public static boolean isEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }    
        else 
        {
            return false;
        }
    }
    public static void main(String args[])
    {
       int a=34;
       int b=35;
       System.out.println(isEven(a));
       System.out.println(isEven(b));
    }
}