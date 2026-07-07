package ar.edu.utn.climalert.climalert.Model.Entities;

import ar.edu.utn.climalert.climalert.services.DTO.Clima;

public class Alerta {
    private float temperaturaMaxima;
    private float porcentajeHumedadMaxima;

    public Boolean esCritica(Clima clima) {
        return clima.getTemperatura() > this.temperaturaMaxima &&
                clima.getHumedad() > this.porcentajeHumedadMaxima;
    }
}