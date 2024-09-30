// package java.Exception;

/**
 *  
 */
class DragonException extends Exception {

}

public class Castles {
    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("This exception");
            // System.out.println("open draw bridge function");
        } catch (Exception e) {
            throw new Exception();
            // System.out.println("open draw bridge function - catch");
        } finally {
            // throw new Exception("Or maybe this one");
            // System.out.println("open draw bridge function - finally");
        }
    }

    public static void main(String[] args) throws Exception {
        new Castles().openDrawbridge();
    }
}
