package io.github.fandreuz.spring.adventures.dependsOn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test that the bean is null and the context does not throw an exception when
 * the bean is not found.
 *
 * @author fandreuz
 */
@SpringBootTest(classes = GhostBean.class)
class TestNoGhost {

	@Autowired(required = false)
	private GhostBean ghostBean;

	@Test
	void test() {
		assertThat(ghostBean).isNull();
	}

}
