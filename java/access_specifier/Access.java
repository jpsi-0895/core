
package java.access_specifier;

/**
 *  Parent
 */
class  Parent {

    void method1(){
        System.out.println("method 1");
    }
    void method2(){
        System.out.println("method 2");
    }
}
public class Access extends Parent{
    public static void main(String[] args) {
        Access obj = new Access();

        obj.method1();
    }
}
