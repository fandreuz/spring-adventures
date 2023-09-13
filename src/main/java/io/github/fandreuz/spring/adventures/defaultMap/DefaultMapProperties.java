package io.github.fandreuz.spring.adventures.defaultMap;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DefaultMapProperties {

	@Value("#{${my.map: {:}}}")
	@Getter
	private Map<String, String> values;

}
