import java.util.HashMap;
import java.util.Hashtable;

public class Test {

    private static final String KEY_PERSON = "hanjietao";
    // remote version
    public static void main(String[] args){
        System.out.println("I don't have to do that.");

        Test test = new Test();
        boolean result = test.ifNeedToWork("hanjietao");

        System.out.println("args = [" + result + "]");


    }


    public boolean ifNeedToWork(String name){
        if(KEY_PERSON.equals(name)){
            return false;
        }

        // local code
        Hashtable h = new Hashtable();
        HashMap<String,Object> hm = new HashMap<>();

        return true;
    }

}
