package io.github.fandreuz.spring.adventures.mapWithNewlines;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

// This fails!
@ExtendWith(SpringExtension.class)
@TestPropertySource(properties = "value: {ciao: '1',\n hello: '2'}")
class MapWithNewlinesTest {

    @Value("#{${value}}")
    private Map<String, String> map;

    @Test
    void test() {
        assertThat(map).containsExactlyInAnyOrderEntriesOf(Map.of("ciao", "1", "hello", "2"));
    }

}
