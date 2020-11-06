package mx.gob.nayarit.service.cobros.abiertos.service;

import mx.gob.nayarit.service.cobros.abiertos.repository.model.CobroAbierto;

import java.util.List;

public interface CobrosAbiertosService {
    List<CobroAbierto> all();
    String genera(CobroAbierto cobroAbierto);
}
