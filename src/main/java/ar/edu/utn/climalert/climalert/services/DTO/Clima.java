package ar.edu.utn.climalert.climalert.services.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clima {
    @JsonProperty("location")
    private Locacion fechaYHora;
    @JsonProperty("current")
    private Current current;
}
