package ar.edu.utn.climalert.climalert.Model.Entities;

import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import java.util.List;

@Component
@AllArgsConstructor
public class Notificador {

    private static final Logger log = (Logger) LoggerFactory.getLogger(Notificador.class);

    private static final List<String> DESTINATARIOS = List.of(
            "admin@clima.com", "emergencias@clima.com", "meteorologia@clima.com"
    );

    public void enviarAlerta(RegistroClima clima) {
        log.warn("""
            ========= ALERTA CLIMÁTICA =========
            Para: {}
            Asunto: Alerta climática
            Temperatura: {}°C
            Humedad: {}%
            Fecha y hora: {}
            ======================================""",
                DESTINATARIOS, clima.getTemperatura(), clima.getHumedad(), clima.getFechaYHora());
    }
}
