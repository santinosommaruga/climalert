package ar.edu.utn.climalert.climalert.Model.Entities;

import org.springframework.stereotype.Component;

@Component
public class Alerta {
    private float temperaturaMaxima = 35;
    private float porcentajeHumedadMaxima = 60;

    public Boolean esCritica(RegistroClima clima) {
        return clima.getTemperatura() > this.temperaturaMaxima &&
                clima.getHumedad() > this.porcentajeHumedadMaxima;
    }
}