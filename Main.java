import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
        
        int wys = 5;
        int b=3;
       for(int t=1; t<=b;t++)
         {
        for (int i = 1; i<=wys; i++)
        {
            for(int j=0;j<wys-i;j++)System.out.print(" ");
            for (int j = 0; j<i-1;j++)System.out.print("*");
            System.out.println(" ");
        }
  
    }
    }
}