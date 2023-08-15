package io.github.fandreuz.spring.adventures.collectionOfMockBeans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@Import(DummyService.class)
class CollectionOfMockBeansTest {

	@MockBean
	@Qualifier("dummyService1")
	@Order(1)
	private SomeInterface dummyService1;
	@MockBean
	@Qualifier("dummyService2")
	@Order(2)
	private SomeInterface dummyService2;

	@Autowired
	private DummyService service;

	@Test
	void test() {
		assertThat(service.getList()).hasSize(2);
		assertThat(service.getList().get(0)).isSameAs(dummyService1);
		assertThat(service.getList().get(1)).isSameAs(dummyService2);
	}

}
