package io.github.fandreuz.spring.adventures.lazyBean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class LazyConsumer {

    private final LazyBean lazyBean;
	private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

	public LazyConsumer(@Lazy LazyBean lazyBean) {
        this.lazyBean = lazyBean;

		long initializationTime = System.nanoTime();
		log.info("Initializing {} at {}", getClass().getSimpleName(), initializationTime);
		executorService.schedule(() -> {
			var now = System.nanoTime();
			log.info("Accessing {}, {}ns after consumer init", lazyBean, now - initializationTime);
            log.info("LazyBean was initialized lazily? {}", now <= lazyBean.getInitializationTime());
		}, 1, TimeUnit.SECONDS);
	}

}
