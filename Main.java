import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
        int wys = 4;
        for (int i = 1; i<=wys; i++)
        {
            for(int j=0;j<wys-i;j++)System.out.println(" ");
            for (int j = 0; j<(i*2)-1;j++)System.out.print("*");
            
        }
  
    }
}