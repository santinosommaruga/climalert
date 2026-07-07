package ar.edu.utn.climalert.climalert.Model.Repository;

import ar.edu.utn.climalert.climalert.Model.Entities.RegistroClima;

public interface ClimaRepository {
    void guardar(RegistroClima clima);

    RegistroClima obtenerUltimo();
}
