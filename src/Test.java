

public class Test {

    private static final String KEY_PERSON = "hanjietao";


    public boolean ifNeedToWork(String name){
        if(KEY_PERSON.equals(name)){
            return false;
        }

        return true;
    }

}
