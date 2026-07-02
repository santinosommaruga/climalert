package ar.edu.utn.climalert.climalert.Model.Entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Clima {
    private long id;
    private LocalDateTime fechaYHora;
    private float temperatura;
    private float humedad;
}
