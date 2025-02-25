package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet();
        assertEquals("Hello, World!", result, "The greet method should return 'Hello, World!'");
    }
}
