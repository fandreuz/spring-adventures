package io.github.fandreuz.spring.adventures.collectionOfMockBeans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DummyService {

	@Autowired
	@Getter
	private List<SomeInterface> list;

}
