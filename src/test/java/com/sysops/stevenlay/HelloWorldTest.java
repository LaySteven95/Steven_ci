package com.sysops.stevenlay;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldTest {
    @Test
    public void should_return_hello_world() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.helloWorld();

        assertThat(result).isEqualTo("Hello world");
    }
}