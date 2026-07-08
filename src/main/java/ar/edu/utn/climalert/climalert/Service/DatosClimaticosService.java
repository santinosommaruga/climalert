package ar.edu.utn.climalert.climalert.Service;

import ar.edu.utn.climalert.climalert.Model.Entities.Alerta;
import ar.edu.utn.climalert.climalert.Model.Entities.Notificador;
import ar.edu.utn.climalert.climalert.Model.Entities.RegistroClima;
import ar.edu.utn.climalert.climalert.Model.Repository.ClimaRepository;
import ar.edu.utn.climalert.climalert.services.BuscadorDatosClimaticos;
import ar.edu.utn.climalert.climalert.services.DTO.Clima;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class DatosClimaticosService {

    private BuscadorDatosClimaticos buscadorDatosClimaticos;
    private ClimaRepository climaRepository;
    private Alerta alerta;
    private Notificador notificador;

    public void evaluarDatosClimaticosXTiempo() {
        Clima dto = buscadorDatosClimaticos.obtenerClimaActual();

        RegistroClima registro = new RegistroClima();
        registro.setFechaYHora(LocalDateTime.now());
        registro.setTemperatura(dto.getCurrent().getTemperaturaCelsius());
        registro.setHumedad(dto.getCurrent().getHumedad());

        climaRepository.guardar(registro);
    }

    public void analizarYAlertar() {
        RegistroClima ultimo = climaRepository.obtenerUltimo();

        if(ultimo == null){
            return;
        }

        if(alerta.esCritica(ultimo)){
            notificador.enviarAlerta(ultimo);
        }
    }
}
