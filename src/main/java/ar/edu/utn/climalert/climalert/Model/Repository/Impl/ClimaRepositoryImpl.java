package ar.edu.utn.climalert.climalert.Model.Repository.Impl;

import ar.edu.utn.climalert.climalert.Model.Entities.RegistroClima;
import ar.edu.utn.climalert.climalert.Model.Repository.ClimaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClimaRepositoryImpl implements ClimaRepository {

    private final List<RegistroClima> registros = new ArrayList<>();

    @Override
    public void guardar(RegistroClima clima) {
        registros.add(clima);
    }

    @Override
    public RegistroClima obtenerUltimo() {
        if (registros.isEmpty()) {
            return null;
        }
        return registros.get(registros.size() - 1);
    }
}
