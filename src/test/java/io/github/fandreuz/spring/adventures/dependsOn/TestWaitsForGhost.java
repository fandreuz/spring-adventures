package io.github.fandreuz.spring.adventures.dependsOn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.annotation.PostConstruct;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test that postConstruct is called only when the not-required bean has
 * completed its initialization.
 *
 * @author fandreuz
 */
@TestPropertySource(properties = GhostBean.GHOST_BEAN_PROPERTY + "=true")
@SpringBootTest(classes = GhostBean.class)
class TestWaitsForGhost {

	@Autowired(required = false)
	private GhostBean ghostBean;

	@PostConstruct
	void postConstruct() {
		assertThat(ghostBean).isNotNull();
	}

	@Test
	void fakeTest() {
		// The real test is in postConstruct
	}

}
