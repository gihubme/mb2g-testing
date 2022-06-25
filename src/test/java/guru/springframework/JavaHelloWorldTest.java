package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaHelloWorldTest {
    @Test
    void test()
    {
        Integer a= JavaHelloWorldMain.Calculator.add(23,98);
        String toPrint= JavaHelloWorldMain.getHello()+", "+ a;

        Assertions.assertEquals(toPrint, "Hello World, 121");

        Assertions.assertEquals(4, JavaHelloWorldMain.Calculator.add(2, 2));

    }


}
