import java.util.*;
class Linkedl
{
  public static void main(String[] args)
  {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter how many name you want to enter");
      int n = s.nextInt();
      LinkedList a1 = new LinkedList();
      for(int i=0;i<n;i++)
         {
             System.out.println("Enter  Name");
             a1.add(s.next());
          }
           System.out.println("Friends Name:" +a1);
         
     }
 }      
           
