package ar.edu.utn.climalert.climalert.services.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Current {
    @JsonProperty("humidity")
    private Integer humedad;

    @JsonProperty("temp_c")
    private float temperaturaCelsius;


}
