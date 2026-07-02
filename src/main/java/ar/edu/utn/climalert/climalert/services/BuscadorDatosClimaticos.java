package ar.edu.utn.climalert.climalert.services;

import ar.edu.utn.climalert.climalert.config.RestTempProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BuscadorDatosClimaticos {
    private RestTemplate restTemplate;
    private RestTempProperties propiedades;

    public BuscadorDatosClimaticos(RestTemplate restTemplate, RestTempProperties propiedades) {
        this.restTemplate = restTemplate;
        this.propiedades = propiedades;
    }
}
