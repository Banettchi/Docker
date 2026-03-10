package co.edu.escuelaing.dockerlab;

import co.edu.escuelaing.dockerlab.controller.HelloRestController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGreetingDefault() {
        HelloRestController controller = new HelloRestController();
        String result = controller.greeting("World");
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testGreetingWithName() {
        HelloRestController controller = new HelloRestController();
        String result = controller.greeting("Diego");
        assertEquals("Hello, Diego!", result);
    }
}
