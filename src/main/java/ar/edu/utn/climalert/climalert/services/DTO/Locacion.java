package ar.edu.utn.climalert.climalert.services.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Locacion {
    @JsonProperty("localtime")
    private String fechaYHora;

}
