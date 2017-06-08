# pro5.java
import java.io.*;
import java.util.*;
public class alphebet
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch;
        ch=s.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println("it is an alphabet");
        }
        else
        {
            System.out.println("it is not an alphabet");
        }
        
        
    }
}
