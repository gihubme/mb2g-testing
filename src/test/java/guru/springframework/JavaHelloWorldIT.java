package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

class JavaHelloWorldIT {
    @Test
    void test()
    {
        //Test will pass
        Assertions.assertEquals(4, JavaHelloWorldMain.Calculator.add(2, 2));

        //Test will fail
        Assertions.assertNotEquals(3, JavaHelloWorldMain.Calculator.add(2, 2), "Calculator.add(2, 2) test failed");

        //Test will fail
        Supplier<String> messageSupplier  = () -> "Calculator.add(2, 2) test failed";
        Assertions.assertNotEquals(3, JavaHelloWorldMain.Calculator.add(2, 2), messageSupplier);
    }


}
