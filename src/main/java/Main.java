import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
ArrayList<String> test=new ArrayList<String>();
        test.add("111");
        test.add("222");
        test.add("333");
        test.add("444");
        test.add("555");
        test.add("555");
        test.add("555");
        test.add("666");
        test.add("777");

ClearDouples remover= new ClearDouples();
     HashSet<String> test2=remover.noTwins(test);
        Iterator<String> it=remover.noTwins(test).iterator();
     do {

         System.out.println(it.next());
     }while(it.hasNext());

    it.remove();


    }
}
