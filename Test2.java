import java.util.*;
public class Test2
{
   public static void main(String[] args)
   {
     LinkedHashSet<String> cars= new  LinkedHashSet();
     cars.add("Honda");
     cars.add("Bugati");
     cars.add("pagini");
     Iterator<String>itr=cars.iterator();
     while(itr.hasNext())
     {
     System.out.println(itr.next());
     }
     }
}
