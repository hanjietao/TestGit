

public class Test {

    private static final String KEY_PERSON = "hanjietao";
    public static void main(String[] args){
        System.out.println("I don't have to do that.");
    }


    public boolean ifNeedToWork(String name){
        if(KEY_PERSON.equals(name)){
            return false;
        }
        return true;
    }

}
