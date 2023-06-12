package io.github.fandreuz.spring.adventures.dependsOn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * A bean which is never part of the context.
 *
 * @author fandreuz
 */
@Slf4j
@ConditionalOnProperty(GhostBean.GHOST_BEAN_PROPERTY)
@Component
public class GhostBean {

	public static final String GHOST_BEAN_PROPERTY = "create.ghost.bean";

	@PostConstruct
	void postConstruct() {
		log.info(">>> Starting initialization of {}", getClass().getSimpleName());
		// An expensive operation
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		log.info(">>> Initialized {}", getClass().getSimpleName());
	}

}
