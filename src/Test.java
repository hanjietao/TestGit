import java.util.HashMap;
import java.util.Hashtable;

public class Test {

    private static final String KEY_PERSON = "hunting human";


    public boolean ifNeedToWork(String name){
        if(KEY_PERSON.equals(name)){
            return false;
        }

        Hashtable h = new Hashtable();
        HashMap<String,Object> hm = new HashMap<>();

        return true;
    }

}
