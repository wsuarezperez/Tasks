package eclipse;
import java.util.LinkedHashSet;
import java.util.* ;

public class One57 {
 public static void main(String[] args) {
  LinkedHashSet<String> hs = new LinkedHashSet<String>();
  hs.add("first");
  hs.add("second");
  hs.add("third");
  hs.add("fourth");
  hs.add("fifth");
  
  System.out.println(hs);
  
  Iterator iterator=hs.iterator();
  while (iterator.hasNext()){
    System.out.println(iterator.next());
    boolean result=hs.contains("fourth");


  }
  System.out.println(hs.remove("fifth"));
  System.out.println(hs);
}
}