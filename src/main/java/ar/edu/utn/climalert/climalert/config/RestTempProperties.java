package ar.edu.utn.climalert.climalert.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rest-temperatures")
public class RestTempProperties {
    private String baseUrl;
}
