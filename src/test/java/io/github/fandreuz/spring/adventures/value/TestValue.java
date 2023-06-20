package io.github.fandreuz.spring.adventures.value;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.SortedMap;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@Slf4j
class TestValue {

	@Value("#{${property.name : {:} }}")
	private SortedMap<String, String> frameworkProperties;

	@Test
	void test() {
		assertThat(frameworkProperties).isNotNull();
	}

}
