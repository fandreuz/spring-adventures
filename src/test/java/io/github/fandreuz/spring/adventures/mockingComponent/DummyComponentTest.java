package io.github.fandreuz.spring.adventures.mockingComponent;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(SpringExtension.class)
class DummyComponentTest {

	@TestConfiguration
	static class Configuration {

		@Bean
		DummyComponent dummyComponent() {
			return mock(DummyComponent.class);
		}

	}

	@Test
	void dummyTest() {
		// ApplicationContext creation failure
		// Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:
		// No qualifying bean of type 'java.lang.Object' available
	}

}
