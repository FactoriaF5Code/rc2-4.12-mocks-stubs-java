package org.ruralcamp;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ExampleTest {

    @Test
    public void example_test() {
        assertThat(2+2, equalTo(4));
    }

}
