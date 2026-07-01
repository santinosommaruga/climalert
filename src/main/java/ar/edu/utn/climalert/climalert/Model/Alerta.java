package ar.edu.utn.climalert.climalert.Model;

public class Alerta {
    private float temperaturaMaxima;
    private float porcentajeHumedadMaxima;

    public Boolean esCritica(Clima clima) {
        return clima.getTemperatura() > this.temperaturaMaxima &&
                clima.getHumedad() > this.porcentajeHumedadMaxima;
    }
}