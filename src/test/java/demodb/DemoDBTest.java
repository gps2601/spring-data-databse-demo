package demodb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoDBTest {
    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }

    @Test
    public void saysHello() {
        DemoDB demoDB = new DemoDB();

        assertEquals(demoDB.sayHello(), "Hello");
    }
}
