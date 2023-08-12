package io.github.fandreuz.spring.adventures.mockingComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyComponent {

	@Autowired
	private Object something;

}
