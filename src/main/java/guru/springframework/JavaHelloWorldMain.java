package guru.springframework;

/**
 * Created by jt on 2018-12-09.
 */
public class JavaHelloWorldMain {

    static void main(String[] args){
        String toPrint=getHello()+", "+Calculator.add(23,98);
        System.out.println("Hello World");

    }
    public static String getHello(){
        return "Hello World";
    }
    public static class Calculator {
        static Integer add(Integer a, Integer b){
            return a+b;
        }
    }
}
