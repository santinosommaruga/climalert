package ar.edu.utn.climalert.climalert.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rest-temperatures")
public class RestTempProperties {
    private String baseUrl;
}
