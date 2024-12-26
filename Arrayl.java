import java.util.*;
class Arrayl
{
  public static void main(String[] args)
  {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter how many Cities you want to enter");
      int n = s.nextInt();
      ArrayList a1 = new ArrayList();
      for(int i=0;i<n;i++)
         {
             System.out.println("Enter your city Name");
             a1.add(s.next());
          }
           System.out.println("Cities:" +a1);
           System.out.println("Before remove size"+a1.size());
           a1.clear();
           System.out.println("Size"+a1.size());
     }
 }      
           
