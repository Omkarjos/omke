import java.util.*;
public class Hashset
{
   public static void main(String[] args)
   {
     HashSet hs=new HashSet(5,0.5f);
     System.out.println(hs.add("Rain"));
     System.out.println(hs.add("Tsunami"));
     System.out.println(hs.add("Storm"));
     System.out.println(hs.add("Cyclone"));
     System.out.println(hs.add("Eruption"));
     System.out.println(hs);
     Boolean  b = hs.add("rain");
     System.out.println("Duplicate item allowed=" +b);
     System.out.println(hs);
     }
}
