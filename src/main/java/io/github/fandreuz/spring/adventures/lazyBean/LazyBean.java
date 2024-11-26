package io.github.fandreuz.spring.adventures.lazyBean;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Slf4j
@Getter
public class LazyBean {

	private final long initializationTime;

	public LazyBean() {
		initializationTime = System.nanoTime();
		log.info("Initializing {} at {}", getClass().getSimpleName(), initializationTime);
	}

}
