package ar.edu.utn.climalert.climalert.services;

import ar.edu.utn.climalert.climalert.config.RestTempProperties;
import ar.edu.utn.climalert.climalert.services.DTO.Clima;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Locale;

@Component
public class BuscadorDatosClimaticos {
    private RestTemplate restTemplate;
    private RestTempProperties propiedades;

    public BuscadorDatosClimaticos(RestTemplate restTemplate, RestTempProperties propiedades) {
        this.restTemplate = restTemplate;
        this.propiedades = propiedades;
    }

    public Clima obtenerClimaActual(){
        String url = propiedades.getBaseUrl() + "/current.json"
                    +"?key=" + propiedades.getKey()
                    +"&q=" +propiedades.getLocation();
        return restTemplate.getForObject(url, Clima.class);

    }
}
