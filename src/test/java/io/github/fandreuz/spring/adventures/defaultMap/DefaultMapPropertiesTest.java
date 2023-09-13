package io.github.fandreuz.spring.adventures.defaultMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@Import(DefaultMapProperties.class)
class DefaultMapPropertiesTest {

	@Autowired
	private DefaultMapProperties properties;

	@Test
	void test() {
		assertThat(properties.getValues()).isEmpty();
	}

}
