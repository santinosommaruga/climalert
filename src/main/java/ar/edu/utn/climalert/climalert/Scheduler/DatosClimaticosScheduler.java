package ar.edu.utn.climalert.climalert.Scheduler;

import ar.edu.utn.climalert.climalert.Service.DatosClimaticosService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatosClimaticosScheduler {
    private final DatosClimaticosService datosClimaticosService;

    public DatosClimaticosScheduler(DatosClimaticosService datosClimaticosService){
        this.datosClimaticosService = datosClimaticosService;
    }

    @Scheduled(fixedRate = 300000) //5minutos
    public void evaluarDatosClimaticos(){
        datosClimaticosService.evaluarDatosClimaticosXTiempo();
    }

    @Scheduled(fixedRate = 60000) //1minuto
    public void analizarUltimoClima(){
        datosClimaticosService.analizarYAlertar();
    }
}
