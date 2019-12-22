import java.util.ArrayList;
import java.util.HashSet;

public class ClearDouples{

    public ClearDouples() {
    }

    public HashSet<String> noTwins(ArrayList<String> arr){
        HashSet<String> filter = new HashSet<String>();

        for(int i=0;i<arr.size();i++){
        filter.add(arr.get(i));


        }
        return filter;


        }
}