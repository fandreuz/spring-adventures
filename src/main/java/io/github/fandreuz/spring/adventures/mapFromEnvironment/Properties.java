package io.github.fandreuz.spring.adventures.mapFromEnvironment;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "io.github.fandreuz.properties")
@Value
public class Properties {

	Map<String, String> map = new HashMap<>();

}
