package io.github.fandreuz.spring.adventures.mapFromEnvironment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(Properties.class)
@TestPropertySource(locations = "classpath:/mapFromEnvironment/properties.yaml")
public class PropertiesTest {

	@Autowired
	private Properties properties;

	@Test
	void testProperties() {
		assertThat(properties.getMap().get("a_boolean")).isExactlyInstanceOf(String.class);
		assertThat(properties.getMap().get("number")).isExactlyInstanceOf(String.class);
	}

}
