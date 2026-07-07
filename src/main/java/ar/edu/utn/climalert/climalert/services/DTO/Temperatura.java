package ar.edu.utn.climalert.climalert.services.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Temperatura {
    @JsonProperty("humidity")
    private Integer humedad;

    @JsonProperty("temp_c")
    private DecimalFormat temperaturaCelsius;

}
